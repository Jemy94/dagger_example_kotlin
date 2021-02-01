package com.jemy.daggerexample

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
 class River {

    fun getWater(): String {
        return "water"
    }
}