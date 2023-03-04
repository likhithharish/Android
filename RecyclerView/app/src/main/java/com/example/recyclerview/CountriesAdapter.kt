package com.example.recyclerview

import android.content.Context
import android.media.Image
import android.nfc.cardemulation.CardEmulation
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CountriesAdapter(
    var countryNameList : ArrayList<String>,
    var detailsList : ArrayList<String>,
    var imageList: ArrayList<Int>,
    var context : Context) : RecyclerView.Adapter<CountriesAdapter.CountryViewHolder>(){

    //class to represent carddesign
    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var textViewCountryName : TextView = itemView.findViewById(R.id.textViewCountryName)
        var textViewDetailsName : TextView = itemView.findViewById(R.id.textViewDetails)
        var imageView : ImageView = itemView.findViewById(R.id.imageView)
        var cardview : CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        //define card design we make - determine which design is displayed in recycler view
        //LayoutInflator- connect a design

        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.card_design,parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        //what to do when design is connected to Recycler View - showing it
        holder.textViewCountryName.text = countryNameList.get(position)
        holder.textViewDetailsName.text = detailsList.get(position)
        holder.imageView.setImageResource(imageList.get(position))

        holder.cardview.setOnClickListener {
            Toast.makeText(context,"You selected the country: ${countryNameList.get(position)}",Toast.LENGTH_LONG).show()
        }

    }

    override fun getItemCount(): Int {
        //Amount of data displayed in Recycler View
        return countryNameList.size
    }




}