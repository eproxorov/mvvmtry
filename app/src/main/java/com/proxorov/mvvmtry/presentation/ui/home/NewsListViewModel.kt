package com.proxorov.mvvmtry.presentation.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import com.proxorov.mvvmtry.domain.interactors.GetNewsInteractor
import com.proxorov.mvvmtry.domain.model.Articles
import com.proxorov.mvvmtry.data.utils.Resource

class NewsListViewModel : ViewModel() {

    fun getArticles(): LiveData<Resource<Articles>> {
        return GetNewsInteractor().getArticles()
    }

    override fun onCleared() {
        super.onCleared()
        GetNewsInteractor().cancel()
    }

}