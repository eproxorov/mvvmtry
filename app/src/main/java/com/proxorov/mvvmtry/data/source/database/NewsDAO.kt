package com.proxorov.mvvmtry.data.source.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.proxorov.mvvmtry.domain.model.NewsItem

@Dao
interface NewsDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
   suspend fun insert(newsItem: NewsItem)

    @Query("SELECT * FROM news")
    fun getAllNews(): LiveData<List<NewsItem>>
}