package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView

    var countryNameList = ArrayList<String>()
    var detailsList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    lateinit var adapter: CountriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity) // staggered grid - vertically/horizantally , grid - column based.

        countryNameList.add("United Kingdom")
        countryNameList.add("Germany")
        countryNameList.add("France")

        detailsList.add("Capital : London")
        detailsList.add("Capital : Munich")
        detailsList.add("Capital : Paris")

        imageList.add(R.drawable.download)
        imageList.add(R.drawable.download_1)
        imageList.add(R.drawable.download_2)

        adapter = CountriesAdapter(countryNameList,detailsList,imageList,this@MainActivity)

        recyclerView.adapter = adapter

    }
}