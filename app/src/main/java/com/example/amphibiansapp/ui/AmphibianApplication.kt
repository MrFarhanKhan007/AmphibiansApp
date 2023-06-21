package com.example.amphibiansapp.ui

import android.app.Application
import com.example.amphibiansapp.data.AppContainer
import com.example.amphibiansapp.data.DefaultAppContainer

class AmphibianApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}