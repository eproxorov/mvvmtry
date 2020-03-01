package com.proxorov.mvvmtry.domain.repository

import androidx.lifecycle.LiveData
import com.proxorov.mvvmtry.data.utils.Resource
import com.proxorov.mvvmtry.domain.model.Articles

interface INewsRepository {

    fun getArticles(): LiveData<Resource<Articles>>
    fun cancel()
}