package com.proxorov.mvvmtry.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import com.proxorov.mvvmtry.presentation.App
import com.proxorov.mvvmtry.domain.model.NewsItem
import com.proxorov.mvvmtry.domain.model.Articles
import com.proxorov.mvvmtry.data.source.database.NewsDAO
import com.proxorov.mvvmtry.data.utils.NetworkStatus
import com.proxorov.mvvmtry.data.source.remote.api.NewsApi
import com.proxorov.mvvmtry.data.utils.GenericApiResponse
import com.proxorov.mvvmtry.data.utils.Resource
import com.proxorov.mvvmtry.domain.repository.INewsRepository
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.lang.Exception
import javax.inject.Inject


class NewsRepository : INewsRepository {

    @Inject
    lateinit var newsApi: NewsApi
    @Inject
    lateinit var newsDAO: NewsDAO
    @Inject
    lateinit var networkStatus: NetworkStatus

    private var repositoryJob: Job? = null

    init {
        App.appComponent.inject(this)
    }

    override fun getArticles(): LiveData<Resource<Articles>> = fetchNews()
    override fun cancel() = cancelActiveJobs()

    private fun fetchNews(): LiveData<Resource<Articles>> {
        return object : NetworkBoundResource<Articles, List<NewsItem>>(networkStatus.isConnectedToTheInternet()) {
            override suspend fun handleApiSuccessResponse(response: GenericApiResponse.ApiSuccessResponse<Articles>) {
                onCompleteJob(Resource.success(response.body))
                updateLocalDb(response.body.newsItems)
                createCacheRequestAndReturn()
            }

            override fun createCall(): LiveData<GenericApiResponse<Articles>> {
                return newsApi.getArticles()
            }

            override fun setJob(job: Job) {
                repositoryJob?.cancel()
                repositoryJob = job
            }

            override suspend fun createCacheRequestAndReturn() {
                withContext(Main) {
                    result.addSource(loadFromCache()) {
                        onCompleteJob(Resource.success(Articles(it)))
                    }
                }
            }

            override fun loadFromCache(): LiveData<List<NewsItem>> {
                return newsDAO.getAllNews()
            }

            override suspend fun updateLocalDb(cacheObject: List<NewsItem>?) {
                if (cacheObject != null) {
                    withContext(IO) {
                        for (newsItem in cacheObject) {
                            try {
                                launch {
                                    newsDAO.insert(newsItem = newsItem)
                                }
                            } catch (e: Exception) {
                                Log.d("updateLocalDb", e.message.toString())
                            }
                        }
                    }
                }
            }
        }.asLiveData()
    }

    private fun cancelActiveJobs() {
        repositoryJob?.cancel()
    }

}