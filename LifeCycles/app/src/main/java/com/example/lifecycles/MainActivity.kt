package com.example.lifecycles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var counter : TextView
    lateinit var increment : Button
    lateinit var result: Button

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counter = findViewById(R.id.textView)
        increment = findViewById(R.id.button)
        result = findViewById(R.id.result)

        increment.setOnClickListener {
            count += 1
            counter.setText(count.toString())
        }

        result.setOnClickListener {
            var intent = Intent(this@MainActivity, SecondActivity:: class.java)

            startActivity(intent)
        }

        Log.d("Message","First Activity onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message","First Activity onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message"," First Activity onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message","First Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message","First Activity onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message","First Activity onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message","First Activity onPause")
    }
}