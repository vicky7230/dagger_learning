package com.vicky7230.testdagger

import dagger.Module
import dagger.Provides

@Module
class OurFirstModule {

    @Provides
    fun provideLogger(): Logger = Logger()
}