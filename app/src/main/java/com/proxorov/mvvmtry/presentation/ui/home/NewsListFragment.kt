package com.proxorov.mvvmtry.presentation.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.proxorov.mvvmtry.R
import com.proxorov.mvvmtry.presentation.ui.home.adapter.BaseAdapter
import com.proxorov.mvvmtry.domain.model.NewsItem
import com.proxorov.mvvmtry.domain.model.Articles
import com.proxorov.mvvmtry.data.utils.Resource
import com.proxorov.mvvmtry.data.utils.Status
import com.proxorov.mvvmtry.presentation.ui.detail.DetailedFragment
import com.proxorov.mvvmtry.presentation.ui.home.adapter.NewsAdapter
import com.proxorov.mvvmtry.presentation.ui.home.adapter.affectOnItemClicks
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_news_list.*

class NewsListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: BaseAdapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_news_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewManager = LinearLayoutManager(context)
        viewAdapter = NewsAdapter()
        setupRecycleView()
        setupViewModel()
    }

    private fun setupViewModel() {
        val viewModel: NewsListViewModel =
            ViewModelProvider(this).get(NewsListViewModel::class.java)

        viewModel.getArticles().observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    hideProgress()
                    doOnSuccess(it)
                }
                Status.LOADING -> {
                    showProgress()
                }
                Status.ERROR -> {
                    hideProgress()
                    it.message?.let { message -> showError(message) }
                }
            }
        })
    }

    private fun doOnSuccess(it: Resource<Articles>) {
        it.data?.newsItems?.forEach {
            viewAdapter.add(it)
        }
        viewAdapter.notifyDataSetChanged()
    }

    private fun setupRecycleView() {
        recyclerView = list.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
            addItemDecoration(
                DividerItemDecoration(
                    context,
                    LinearLayoutManager.VERTICAL
                )
            )
            affectOnItemClicks { position, view ->
                val newsItem = viewAdapter.getItem(position) as NewsItem
                openDetailedFragment(newsItem)
            }
        }
    }

    private fun showError(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    private fun showProgress() {
        requireActivity().progress.visibility = View.VISIBLE
    }

    private fun hideProgress() {
        requireActivity().progress.visibility = View.INVISIBLE
    }

    private fun openDetailedFragment(newsItem: NewsItem) {
        val fragment = DetailedFragment.newInstance(newsItem = newsItem)
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}