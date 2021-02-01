package com.jemy.daggerexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton


@ActivityScope
class Coffee @Inject constructor(
    val river: River,
    @Sugar val sugar: Int,
    @Milk val milk: Int
) {

    val TAG = "MainActivity onCreate:"

    @Inject
    lateinit var farm: Farm

    fun getCoffeeCup(): String {
        return "${farm.getBeans()} + ${river.getWater()} + sugar: ${sugar} + milk: ${milk}"
    }

    @Inject
    fun connectElectricity() {
        Log.d(TAG, "Connecting.....")
    }
}
