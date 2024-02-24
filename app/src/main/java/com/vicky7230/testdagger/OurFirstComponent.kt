package com.vicky7230.testdagger

import dagger.Component

@Component(modules = [OurFirstModule::class])
interface OurFirstComponent {
    fun giveGraphModulesToMainActivity(mainActivity: MainActivity)
}