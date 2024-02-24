package com.vicky7230.testdagger

import android.content.Context
import androidx.core.content.edit
import androidx.preference.PreferenceManager
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SharedPreferencesManager @Inject constructor(context: Context) {

    private companion object {
        private const val FIRST_TIME_LAUNCH_KEY = "firstTimeLaunch"
        private const val FIRST_TIME_MAIN_ACTIVITY_LAUNCH_KEY = "firstTimeMainActivityLaunch"
    }

    private val sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context)

    val firstTimeLaunchMainActivitySinceInstall
        get() = sharedPrefs.getBoolean(FIRST_TIME_MAIN_ACTIVITY_LAUNCH_KEY, true)

    val firstTimeLaunchSinceInstall
        get() = sharedPrefs.getBoolean(FIRST_TIME_LAUNCH_KEY, true)

    fun appHasBeenLaunchedForTheFirstTime() = sharedPrefs.edit(true) {
        putBoolean(FIRST_TIME_LAUNCH_KEY, false)
    }

    fun mainActivityHasBeenLaunchedForTheFirstTime() = sharedPrefs.edit(true) {
        putBoolean(FIRST_TIME_MAIN_ACTIVITY_LAUNCH_KEY, false)
    }
}