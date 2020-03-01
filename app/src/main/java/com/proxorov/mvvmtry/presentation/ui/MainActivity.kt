package com.proxorov.mvvmtry.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.proxorov.mvvmtry.presentation.ui.home.NewsListFragment
import com.proxorov.mvvmtry.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            showNewsListFragment()
        }
    }

    private fun showNewsListFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container, NewsListFragment(), null)
            .commit()
    }

}
