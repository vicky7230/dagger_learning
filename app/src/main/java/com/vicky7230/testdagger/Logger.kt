package com.vicky7230.testdagger

import android.util.Log

class Logger {
    fun log(text: String) {
        Log.d(this::class.java.simpleName, text)
    }
}