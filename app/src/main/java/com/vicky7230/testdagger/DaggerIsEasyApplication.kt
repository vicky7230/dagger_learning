package com.vicky7230.testdagger

import android.app.Application
import android.util.Log
import javax.inject.Inject

class DaggerIsEasyApplication : Application() {

    lateinit var applicationComponent: SingletonComponent
        private set

    @Inject
    lateinit var sharedPreferencesManager: SharedPreferencesManager

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerSingletonComponent.factory().create(this).also {
            it.provideGraphInside(this)
        }

        if (sharedPreferencesManager.firstTimeLaunchSinceInstall) {
            Log.d(
                this::class.java.simpleName,
                "App is launched for the first time since installation time"
            )
            sharedPreferencesManager.appHasBeenLaunchedForTheFirstTime()
        }
    }
}