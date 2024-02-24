package com.vicky7230.testdagger

import android.util.Log
import javax.inject.Inject

class Messenger @Inject constructor() {

    fun debugMessage(string: String){
        Log.d(this::class.java.simpleName, string)
    }

    fun warningMessage(string: String){
        Log.w(this::class.java.simpleName, string)
    }
}