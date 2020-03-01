package com.proxorov.mvvmtry.presentation.ui.detail

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide

import com.proxorov.mvvmtry.R
import com.proxorov.mvvmtry.databinding.FragmentDetailedBinding
import com.proxorov.mvvmtry.domain.model.NewsItem
import kotlinx.android.synthetic.main.fragment_detailed.*

/**
 * A simple [Fragment] subclass.
 */
class DetailedFragment : Fragment() {

    lateinit var mBinding: FragmentDetailedBinding
    private lateinit var newsItem: NewsItem

    override fun onAttach(context: Context) {
        super.onAttach(context)
        arguments?.getParcelable<NewsItem>(arg1)?.let {
            newsItem = it
        }
    }

    companion object {
        const val arg1: String = "arg1"

        @JvmStatic
        fun newInstance(newsItem: NewsItem) = DetailedFragment().apply {
            arguments = Bundle().apply {
                putParcelable(arg1, newsItem)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_detailed, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.newsItem = newsItem
    }
}
