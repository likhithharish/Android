package com.example.edittexts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var  usertext : TextView
    lateinit var  username : TextView
    lateinit var  passtext : TextView
    lateinit var  password : TextView
    lateinit var  signup : TextView
    lateinit var  sigin : TextView

    lateinit var image : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usertext = findViewById(R.id.textView)
        passtext = findViewById(R.id.textView2)
        username = findViewById(R.id.userName)
        password = findViewById(R.id.password)
        image = findViewById(R.id.image)
        signup = findViewById(R.id.signup)
        sigin = findViewById(R.id.signin)

        signup.setOnClickListener {
            val value : String = username.text.toString()
            sigin.setText("Welcome, $value!")
            image.setImageResource(R.drawable.second_image)


        }

    }
}