package com.vicky7230.testdagger

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Logger @Inject constructor(
    private val messenger: Messenger
) {

    init {
        debug("LOGGER INITIALIZED")
    }

    private lateinit var onMessageReceived: onMessageReceived

    fun debug(text: String) {
        messenger.debugMessage(text)
        //onMessageReceived.forMessage(text)
    }

    @Inject
    fun addTextProcessor(textProcessor: TextToStorage) {
        onMessageReceived = textProcessor.addMessageListener()
    }
}