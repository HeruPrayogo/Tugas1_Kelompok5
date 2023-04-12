package com.example.tugas1_kelompok5


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick
import androidx.navigation.Navigation
import androidx.navigation.findNavController

import androidx.recyclerview.widget.RecyclerView
import com.example.tugas1_kelompok5.databinding.ItemFilmBinding


class AdapterFilm(var dataFilm: ArrayList<DataFilm>):RecyclerView.Adapter<AdapterFilm.ViewHolder>() {
    var onClick:((DataFilm)-> Unit)? = null
    class ViewHolder(val binding:ItemFilmBinding):RecyclerView.ViewHolder(binding.root) {

        fun bind(itemData: DataFilm){
            binding.film = itemData
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterFilm.ViewHolder {
        var view = ItemFilmBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterFilm.ViewHolder, position: Int) {
        val data = dataFilm[position]
        holder.bind(data)
        holder.binding.poster.setOnClickListener {
            onClick?.invoke(data)
        }
    }

    override fun getItemCount(): Int {
        return dataFilm.size
    }
    fun setItemDataFilm(dataFilm: ArrayList<DataFilm>){
        this.dataFilm =dataFilm
    }

}