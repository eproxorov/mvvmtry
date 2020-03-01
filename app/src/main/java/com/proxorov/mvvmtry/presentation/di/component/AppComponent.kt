package com.proxorov.mvvmtry.presentation.di.component

import com.proxorov.mvvmtry.data.utils.NetworkStatus
import com.proxorov.mvvmtry.presentation.di.module.RestModule
import com.proxorov.mvvmtry.presentation.di.module.AppModule
import com.proxorov.mvvmtry.data.repository.NewsRepository
import com.proxorov.mvvmtry.domain.interactors.GetNewsInteractor
import dagger.Component
import javax.inject.Singleton

@Component(modules = [RestModule::class, AppModule::class])
@Singleton
interface AppComponent {

    fun inject(newsRepository: NewsRepository)

    fun inject(getNewsInteractor: GetNewsInteractor)

    fun inject(networkStatus: NetworkStatus)
}