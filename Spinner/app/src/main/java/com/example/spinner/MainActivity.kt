package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() , AdapterView.OnItemSelectedListener{

    lateinit var spinner : Spinner
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spinner)
        result = findViewById(R.id.textview)

        var arrayAdapter = ArrayAdapter.createFromResource( // Array adapter connects Adapterview(list view,resource view spinner) to data source(Arraylist,db)
            this, //will work in this class  (or this@MainActivity)
            R.array.countries, // Array id specified in strings.xml
            android.R.layout.simple_spinner_item //Layout resources existing / create ur own.
        )

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = arrayAdapter

        spinner.onItemSelectedListener = this

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        result.text = parent!!.getItemAtPosition(position).toString()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

}