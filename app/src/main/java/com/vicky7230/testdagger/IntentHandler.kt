package com.vicky7230.testdagger

import android.content.ClipData
import android.content.Intent

class IntentHandler(private val intent: Intent) {

    fun getObfuscatedClipData() = obfuscate(intent.clipData)

    private fun obfuscate(clipData: ClipData?): ClipData? {
        //some magic obfuscation
        //call it magic
        //call it true
        return clipData
    }
}