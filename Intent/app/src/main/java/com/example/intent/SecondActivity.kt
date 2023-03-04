package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {

    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        result = findViewById(R.id.textView)

        var username : String = intent.getStringExtra("username").toString()
        var userage: String = intent.getStringExtra("userage").toString() //if we are getting boolean
        //then use getBooleanExtra, int- getIntExtra etc.

        result.setText("Your name is $username, your age is $userage")

    }
}