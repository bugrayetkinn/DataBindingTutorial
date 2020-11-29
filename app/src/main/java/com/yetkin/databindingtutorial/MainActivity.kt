package com.yetkin.databindingtutorial

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.yetkin.databindingtutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        //setContentView(R.layout.activity_main)

        /*activityMainBinding.userName = "Buğra Yetkin"
        activityMainBinding.userAge = 23*/

        activityMainBinding.apply {
            userName = "Buğra Yetkin"
            userAge = 23
            activity = MainActivity()
        }
    }

    fun buttonClickListener() {
        Log.e("ButtonClick", "..")
    }
}
