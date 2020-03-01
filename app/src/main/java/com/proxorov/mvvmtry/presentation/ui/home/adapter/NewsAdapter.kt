package com.proxorov.mvvmtry.presentation.ui.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.proxorov.mvvmtry.databinding.NewsitemRowBinding
import com.proxorov.mvvmtry.domain.model.NewsItem


class NewsAdapter() : BaseAdapter<NewsAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = NewsitemRowBinding.inflate(layoutInflater, parent, false)
        return NewsViewHolder(binding.root)
    }

    class NewsViewHolder(view: View) : BaseAdapter.BaseViewHolder(view) {
        private var mBinding: NewsitemRowBinding? = null

        override fun bind(item: Any) {
            let {
                item as NewsItem
                mBinding = DataBindingUtil.bind(view)
                mBinding?.newsItem = item
            }
        }
    }
}