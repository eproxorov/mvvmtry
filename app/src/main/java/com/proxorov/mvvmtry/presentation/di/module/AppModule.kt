package com.proxorov.mvvmtry.presentation.di.module

import android.content.Context
import androidx.room.Room
import com.proxorov.mvvmtry.data.utils.NetworkStatus
import com.proxorov.mvvmtry.data.repository.NewsRepository
import com.proxorov.mvvmtry.data.source.database.NewsDAO
import com.proxorov.mvvmtry.data.source.database.NewsDB
import com.proxorov.mvvmtry.domain.repository.INewsRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val application: Context) {

    @Singleton
    @Provides
    fun provideContext(): Context = application.applicationContext

    @Singleton
    @Provides
    fun provideNewsRepository(): INewsRepository = NewsRepository()

    @Provides
    @Singleton
    fun provideNetworkStatus(application: Context): NetworkStatus {
        return NetworkStatus(application)
    }

    @Singleton
    @Provides
    fun provideNewsDB(): NewsDB {
        return Room.databaseBuilder(
            application.applicationContext,
            NewsDB::class.java,
            "database"
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideNewsDAO(db: NewsDB): NewsDAO {
        return db.newsDAO
    }
}