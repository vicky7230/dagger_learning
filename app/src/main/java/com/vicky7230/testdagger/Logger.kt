package com.vicky7230.testdagger

import javax.inject.Inject

class Logger @Inject constructor(
    private val messenger: Messenger
) {
    private lateinit var onMessageReceived: onMessageReceived

    fun debug(text: String) {
        messenger.debugMessage(text)
        onMessageReceived.forMessage(text)
    }

    @Inject
    fun addTextProcessor(textProcessor: TextToStorage){
        onMessageReceived = textProcessor.addMessageListener()
    }
}