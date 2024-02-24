package com.vicky7230.testdagger

import android.os.Bundle
import javax.inject.Inject

@ActivityScoped
class Bundler @Inject constructor(private val savedInstanceState: Bundle?) {

    fun unbundle() {
        savedInstanceState // > perform some magic
    }
}