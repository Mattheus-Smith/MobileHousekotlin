package com.mobilekotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        next()
    }

    fun next(){
        val intent = Intent(this, ActivityMenu::class.java)
        startActivity(intent)
    }
}