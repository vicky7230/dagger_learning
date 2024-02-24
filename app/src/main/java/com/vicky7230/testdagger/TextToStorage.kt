package com.vicky7230.testdagger

import android.util.Log
import javax.inject.Inject

class TextToStorage @Inject constructor() {

    init {
        Log.d(this::class.java.simpleName, "initialized")
    }


    fun addMessageListener(): onMessageReceived {
        return object : onMessageReceived {
            override fun forMessage(message: String) {
                saveMessageToStorageAndPushToServer(message)
            }
        }
    }

    /**
     * Function that "does some heavy processing and saves the message to storage and sends to server"
     */
    private fun saveMessageToStorageAndPushToServer(text: String) {
        Log.d(this::class.java.simpleName, "SAVING MESSAGE TO STORAGE AND SEND TO SERVER $text")
    }
}