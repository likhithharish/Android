package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {

    lateinit var gridView: GridView
    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)

        fillArrays()

        val adapter = AnimalsAdapter(this, nameList, imageList)

        gridView.adapter = adapter

    }

    fun fillArrays(){
        nameList.add("1")
        nameList.add("2")
        nameList.add("3")
        nameList.add("4")
        nameList.add("5")
        nameList.add("6")
        nameList.add("7")
        nameList.add("8")
        nameList.add("9")

        imageList.add(R.drawable.images)
        imageList.add(R.drawable.images)
        imageList.add(R.drawable.images)
        imageList.add(R.drawable.images)
        imageList.add(R.drawable.images)
        imageList.add(R.drawable.images)
        imageList.add(R.drawable.images)
        imageList.add(R.drawable.images)
        imageList.add(R.drawable.images)
    }

}