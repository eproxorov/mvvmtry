package com.proxorov.mvvmtry.domain.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "news")
data class NewsItem(
    @SerializedName("title")
    @Expose
    @PrimaryKey
    val name: String,
    @SerializedName("description")
    @Expose
    val description: String,
    @SerializedName("urlToImage")
    @Expose
    val urlToImage: String?
) : Parcelable
