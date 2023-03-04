package com.example.checkboxes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var male : CheckBox
    lateinit var female : CheckBox
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        male = findViewById(R.id.Male)
        female = findViewById(R.id.Female)
        result = findViewById(R.id.result)

        male.setOnClickListener {
            if(male.isChecked){
                result.text = "Your gender is Male"
                result.setTextColor(Color.BLACK)
                result.textSize = 20.0F
                female.isChecked = false
            }
        }

        female.setOnClickListener{
            if(female.isChecked){
                result.text = "Your gender is Female"
                result.setTextColor(Color.BLACK)
                result.textSize = 20.0F
                male.isChecked = false
            }
        }


    }
}