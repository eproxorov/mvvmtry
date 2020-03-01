package com.proxorov.mvvmtry.data.source.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.proxorov.mvvmtry.domain.model.NewsItem

@Database(entities = [NewsItem::class], version = 1, exportSchema = false)
abstract class NewsDB : RoomDatabase() {
    abstract val newsDAO: NewsDAO
}