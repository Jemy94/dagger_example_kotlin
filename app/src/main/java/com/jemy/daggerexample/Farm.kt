package com.jemy.daggerexample

import javax.inject.Inject
import javax.inject.Singleton

@ActivityScope
 class Farm @Inject constructor() {

    fun getBeans(): String {
        return "Beans"
    }
}