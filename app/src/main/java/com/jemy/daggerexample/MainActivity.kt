package com.jemy.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity onCreate:"

    @Inject
    lateinit var coffee: Coffee

    @Inject
    lateinit var coffee2: Coffee

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as DaggerApplication).getAppComponent()
        val coffeeComponent = appComponent.getCoffeeComponentBuilder().milk(1).sugar(2).build()
        coffeeComponent.inject(this)
        Log.d(
            TAG, "${coffee.getCoffeeCup()}  \n" +
                    " $coffee \n" +
                    " $coffee2" +
                    "\n ${coffee.river}" +
                    "  \n ${coffee2.river}  "
        )
    }
}
