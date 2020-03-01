package com.proxorov.mvvmtry.presentation.utils.databinding

import android.content.Context
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


object GlideBindingAdapters {
    @BindingAdapter("imageResource")
    @JvmStatic
    fun setImageWithGlide(view: ImageView, imageUrl: String?) {
        val context: Context = view.context

        Glide.with(context)
            .load(imageUrl)
            .into(view)
    }
}