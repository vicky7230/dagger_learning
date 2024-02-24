package com.vicky7230.testdagger

import android.util.Log

object TestSingleton {
    init {
        Log.d("Real singleton", "INITIALIZED")
    }

    fun log(text: String) {
        Log.d("Real singleton ${this::class.java}", text)
    }
}