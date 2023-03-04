package com.example.constraintlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var buttonA : TextView
    lateinit var buttonB : TextView

    lateinit var myText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonA = findViewById(R.id.button3)
        buttonB = findViewById(R.id.button4)
        myText = findViewById(R.id.textView4)

        buttonA.setOnClickListener{

            myText.setText("THis is changed now!!")

        }

        buttonB.setOnClickListener {
            myText.isVisible = false
            buttonA.isVisible = false
        }



    }
}