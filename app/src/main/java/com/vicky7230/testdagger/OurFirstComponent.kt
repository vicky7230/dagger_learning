package com.vicky7230.testdagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component/*(modules = [OurFirstModule::class])*/
interface OurFirstComponent {
    fun createSingletons(testApplication: TestApplication)

}