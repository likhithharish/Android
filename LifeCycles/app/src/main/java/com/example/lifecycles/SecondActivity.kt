package com.example.lifecycles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        button = findViewById(R.id.mainButton)

        button.setOnClickListener {

            startActivity(Intent(this@SecondActivity, MainActivity::class.java))
        }

        Log.d("Message","SECOND Activity onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message","SECOND Activity onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message"," SECOND Activity onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message","SECOND Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message","SECOND Activity onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message","SECOND Activity onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message","SECOND Activity onPause")
    }
}