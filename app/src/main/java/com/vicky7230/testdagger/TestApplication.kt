package com.vicky7230.testdagger

import android.app.Application
import javax.inject.Inject

class TestApplication : Application() {

    @Inject
    lateinit var logger: Logger


    override fun onCreate() {
        super.onCreate()
        DaggerOurFirstComponent.create().createSingletons(this)
    }
}