package com.vicky7230.testdagger

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component
@Singleton
interface SingletonComponent {

    @Component.Factory
    interface SingletonComponentFactory {
        fun create(@BindsInstance context: Context): SingletonComponent
    }

    fun activityComponentFactory() : ActivityComponent.Factory
    fun provideGraphInside(application: DaggerIsEasyApplication)
}