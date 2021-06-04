package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application

import android.content.Context

class SunnyWeatherApplication : Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN="QYvKMBehXo4bt0Fi"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}