package com.proxorov.mvvmtry.data.source.remote.api

import androidx.lifecycle.LiveData
import com.proxorov.mvvmtry.domain.model.Articles
import com.proxorov.mvvmtry.data.utils.GenericApiResponse
import retrofit2.http.GET


interface NewsApi {

    @GET("/v2//top-headlines?country=ru&apiKey=d93b0f66d02442ada6e8751df3a0c295")
    fun getArticles(): LiveData<GenericApiResponse<Articles>>

}