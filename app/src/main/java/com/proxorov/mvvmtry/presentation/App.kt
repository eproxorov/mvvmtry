package com.proxorov.mvvmtry.presentation

import android.app.Application
import com.proxorov.mvvmtry.presentation.di.component.AppComponent
import com.proxorov.mvvmtry.presentation.di.component.DaggerAppComponent
import com.proxorov.mvvmtry.presentation.di.module.AppModule


import com.proxorov.mvvmtry.presentation.di.module.RestModule

class App : Application() {
    companion object{
        lateinit var appComponent: AppComponent
    }
    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    private fun initDagger() {
        appComponent = DaggerAppComponent.builder()
            .restModule(RestModule())
            .appModule(AppModule(applicationContext))
            .build()
    }
}