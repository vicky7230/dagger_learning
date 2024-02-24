package com.vicky7230.testdagger

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var sharedPreferencesManager: SharedPreferencesManager

    @Inject
    lateinit var intentHandler: IntentHandler

    @Inject
    lateinit var bundler: Bundler

    override fun onCreate(savedInstanceState: Bundle?) {

        injector {

            activityComponentFactory().create(savedInstanceState, intent)
                .also { activityComponent ->
                    activityComponent.inject(this@MainActivity)
                }
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (sharedPreferencesManager.firstTimeLaunchMainActivitySinceInstall) {
            Log.d(
                this::class.java.simpleName,
                "Main activity is launched for the first time since installation time"
            )
            sharedPreferencesManager.mainActivityHasBeenLaunchedForTheFirstTime()
        }

        if (intentHandler.getObfuscatedClipData() != null) {
            Log.d(this::class.java.simpleName, "send obfuscated clip data to server")
        } else {
            Log.d(this::class.java.simpleName, "obfuscated data not available, ignore")
        }

        bundler.unbundle()

    }
}