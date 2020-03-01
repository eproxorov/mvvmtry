package com.proxorov.mvvmtry.domain.interactors

import androidx.lifecycle.LiveData
import com.proxorov.mvvmtry.presentation.App
import com.proxorov.mvvmtry.domain.model.Articles
import com.proxorov.mvvmtry.data.utils.Resource
import com.proxorov.mvvmtry.domain.repository.INewsRepository
import javax.inject.Inject


class GetNewsInteractor {
    @Inject
    lateinit var newsRepository: INewsRepository

    init {
        App.appComponent.inject(this)
    }

    fun getArticles(): LiveData<Resource<Articles>> = newsRepository.getArticles()

    fun cancel() = newsRepository.cancel()
}