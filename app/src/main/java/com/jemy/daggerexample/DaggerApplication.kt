package com.jemy.daggerexample

import android.app.Application
import android.content.Context

class DaggerApplication : Application() {

    private lateinit var component:AppComponent
    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.create()

    }

    fun getAppComponent():AppComponent{
        return component
    }
}