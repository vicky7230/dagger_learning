package com.vicky7230.testdagger

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as TestApplication).logger.debug(this::class.java.simpleName)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, SecondActivity::class.java))
        }, 2000)

    }
}