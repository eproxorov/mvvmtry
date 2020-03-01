package com.proxorov.mvvmtry.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.annotation.MainThread
import com.proxorov.mvvmtry.data.utils.ErrorHandling
import com.proxorov.mvvmtry.data.utils.ErrorHandling.Companion.ERROR_CHECK_NETWORK_CONNECTION
import com.proxorov.mvvmtry.data.utils.ErrorHandling.Companion.ERROR_UNKNOWN
import com.proxorov.mvvmtry.data.utils.ErrorHandling.Companion.UNABLE_TODO_OPERATION_WO_INTERNET
import com.proxorov.mvvmtry.data.utils.ErrorHandling.Companion.UNABLE_TO_RESOLVE_HOST
import com.proxorov.mvvmtry.data.utils.GenericApiResponse
import com.proxorov.mvvmtry.data.utils.GenericApiResponse.*
import com.proxorov.mvvmtry.data.utils.Resource
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main


/**
 *BASED ON
 * A generic class that can provide a resource backed by both the sqlite database and the network.
 *
 *
 * You can read more about it in the [Architecture
 * Guide](https://developer.android.com/arch).
 * @param <ResponseObject>
 * @param <RequestType>
</RequestType></ResponseObject> */
abstract class NetworkBoundResource<ResponseObject, CasheObject>
constructor(private val isNetworkAvailable: Boolean) {

    val result = MediatorLiveData<Resource<ResponseObject>>()
    private lateinit var job: CompletableJob
    private lateinit var coroutineScope: CoroutineScope

    fun onCompleteJob(state: Resource<ResponseObject>) {
        GlobalScope.launch(Main) {
            job.complete()
            setValue(state)
        }
    }

    fun onErrorReturn(errorMessage: String?) {
        var msg = errorMessage
        if (msg == null) {
            msg = ERROR_UNKNOWN
        } else if (ErrorHandling.isNetworkError(msg)) {
            msg = ERROR_CHECK_NETWORK_CONNECTION
        }
        onCompleteJob(
            Resource.error(
                msg = msg,
                data = null
            )
        )
    }

    @UseExperimental(InternalCoroutinesApi::class)
    private fun initNewJob(): Job {
        job = Job()
        job.invokeOnCompletion(
            onCancelling = true,
            invokeImmediately = true,
            handler = object : CompletionHandler {
                override fun invoke(cause: Throwable?) {
                    if (job.isCancelled) {
                        Log.d("NEWTAG", "Job is canceled")
                        cause?.let {
                            onErrorReturn(it.message)
                        } ?: onErrorReturn(ERROR_UNKNOWN)
                    } else if (job.isCompleted) {
                        Log.d("NEWTAG", "Job is completed")
                    }
                }
            })

        coroutineScope = CoroutineScope(IO + job)
        return job
    }

    init {
        setJob(initNewJob())
        setValue(Resource.loading(null))

        // view cache to start
        val dbSource = loadFromCache()
        result.addSource(dbSource){
            result.removeSource(dbSource)
            setValue(Resource.loading(null))
        }

        if (isNetworkAvailable) {
            doNetworkRequest()
        } else {
            doCacheRequest()
            onErrorReturn(UNABLE_TODO_OPERATION_WO_INTERNET)
        }
    }

    private fun doCacheRequest(){
        coroutineScope.launch {
            // View data from cache only and return
            createCacheRequestAndReturn()
        }
    }

    private fun doNetworkRequest() {
        coroutineScope.launch {
            withContext(Main) {
                // make network call
                val apiResponse = createCall()
                result.addSource(apiResponse) { response ->
                    result.removeSource(apiResponse)

                    coroutineScope.launch {
                        handleNetworkCall(response)
                    }
                }
            }
        }

        /**checking for network timeout**/
        GlobalScope.launch(IO) {
            delay(6000)
            if (!job.isCompleted) {
                job.cancel(CancellationException(UNABLE_TO_RESOLVE_HOST))
            }
        }
    }

    private suspend fun handleNetworkCall(response: GenericApiResponse<ResponseObject>?) {
        when (response) {
            is ApiSuccessResponse -> {
                handleApiSuccessResponse(response)
            }
            is ApiEmptyResponse -> {
                onErrorReturn("HTTP 204 - Request returned nothing")
            }
            is ApiErrorResponse -> {
                doCacheRequest()
                onErrorReturn(response.errorMessage)
            }
        }
    }

    @MainThread
    private fun setValue(newValue: Resource<ResponseObject>) {
        if (result.value != newValue) {
            result.value = newValue
        }
    }

    fun asLiveData() = result as LiveData<Resource<ResponseObject>>

    protected abstract suspend fun createCacheRequestAndReturn()

    protected abstract suspend fun handleApiSuccessResponse(response: ApiSuccessResponse<ResponseObject>)

    protected abstract fun createCall(): LiveData<GenericApiResponse<ResponseObject>>

    protected abstract fun loadFromCache(): LiveData<CasheObject>

    protected abstract suspend fun updateLocalDb(cacheObject: CasheObject?)

    protected abstract fun setJob(job: Job)
}