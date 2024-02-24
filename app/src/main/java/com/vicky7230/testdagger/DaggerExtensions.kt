package com.vicky7230.testdagger

import androidx.appcompat.app.AppCompatActivity

inline fun AppCompatActivity.injector(action: SingletonComponent.() -> Unit) {
    (application as DaggerIsEasyApplication).applicationComponent.action()
}