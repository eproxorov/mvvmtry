package com.proxorov.mvvmtry.data.utils

import android.content.Context
import android.net.ConnectivityManager
import android.util.Log

class NetworkStatus(application: Context) {

    var context: Context = application

    fun isConnectedToTheInternet(): Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        try {
            return cm.activeNetworkInfo.isConnected
        } catch (e: Exception) {
            Log.e("isConnectedInternet", "isConnectedToTheInternet: ${e.message}")
        }
        return false
    }
}