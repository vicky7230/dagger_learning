package com.vicky7230.testdagger

import android.util.Log
import javax.inject.Inject

class Logger @Inject constructor() {
    fun log(text: String) {
        Log.d(this::class.java.simpleName, text)
    }
}