package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity(){

    lateinit var list : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list = findViewById(R.id.listView)

        var countryList = resources.getStringArray(R.array.countriesList)

        var arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,countryList)

        list.adapter = arrayAdapter

        list.setOnItemClickListener { parent, view, position, id ->
            val countryName : String = parent.getItemAtPosition(position).toString()
            Toast.makeText(this,"You selected $countryName",Toast.LENGTH_LONG).show()
        }


    }
}