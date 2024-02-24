package com.vicky7230.testdagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    internal lateinit var logger: Logger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerOurFirstComponent.create().giveGraphModulesToMainActivity(this)

        logger.debug("Dagger2 is easy!")

    }
}