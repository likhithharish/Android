package com.example.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    lateinit var image : ImageView

    lateinit var  button : ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        image = findViewById(R.id.imageView)

        button.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked){
                image.visibility = View.INVISIBLE

            }else{
                image.visibility = View.VISIBLE
            }
        }
    }
}