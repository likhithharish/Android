package com.example.radiobutton

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var radio1 : RadioButton
    lateinit var radio2 : RadioButton
    lateinit var radio3 : RadioButton
    lateinit var button: Button
    lateinit var layout : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radio1 = findViewById(R.id.button1)
        radio2 = findViewById(R.id.button2)
        radio3 = findViewById(R.id.button3)

        button = findViewById(R.id.button)
        layout = findViewById(R.id.bg)

        button.setOnClickListener {
            if(radio1.isChecked == true){
                layout.setBackgroundColor(Color.BLUE)
                radio1.isChecked = false
                radio1.setTextColor(Color.WHITE)
                radio2.setTextColor(Color.WHITE)
                radio3.setTextColor(Color.WHITE)
            }else if (radio2.isChecked == true){
                layout.setBackgroundColor(Color.BLACK)
                radio2.isChecked = false
                radio1.setTextColor(Color.WHITE)
                radio2.setTextColor(Color.WHITE)
                radio3.setTextColor(Color.WHITE)
            }else{
                layout.setBackgroundColor(Color.YELLOW)
                radio3.isChecked = false
                radio1.setTextColor(Color.BLACK)
                radio2.setTextColor(Color.BLACK)
                radio3.setTextColor(Color.BLACK)
            }
        }


    }
}