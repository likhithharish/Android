package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var name : EditText
    lateinit var age : EditText
    lateinit var enter : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        age = findViewById(R.id.age)
        enter = findViewById(R.id.button)

        enter.setOnClickListener {
            //send details to other activity
            //create new activity - click app folder and create new empty activity

            var userName : String = name.text.toString()
            var userAge : String = age.text.toString()

            var intent = Intent(this@MainActivity, SecondActivity:: class.java)
                //takes ofirst param - the intiial activity , second param - activity we are trying to launch

            //sending data
            intent.putExtra("username",userName)
            intent.putExtra("userage",userAge)
            startActivity(intent) // starting the second activity
        }

    }
}