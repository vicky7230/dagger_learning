package com.vicky7230.testdagger

import android.content.Intent
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {

    @Provides
    @ActivityScoped
    fun intentHandler(intent: Intent) = IntentHandler(intent)
}