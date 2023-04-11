package com.example.tugas1_kelompok5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas1_kelompok5.databinding.ItemFilmBinding


class AdapterFilm(var dataFilm: ArrayList<DataFilm>):RecyclerView.Adapter<AdapterFilm.ViewHolder>() {
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
        holder.bind(dataFilm[position])
    }

    override fun getItemCount(): Int {
        return dataFilm.size
    }
    fun setItemDataFilm(dataFilm: ArrayList<DataFilm>){
        this.dataFilm =dataFilm
    }
}