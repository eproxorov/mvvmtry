package com.proxorov.mvvmtry.domain.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Articles (
    @SerializedName("articles")
    @Expose
    val newsItems: List<NewsItem>
)