package com.example.tugas1_kelompok5

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas1_kelompok5.databinding.ItemFilmBinding

class AdapterFilm(var dataFilm: ArrayList<DataFilm>) :
    RecyclerView.Adapter<AdapterFilm.ViewHolder>() {

    var onClick: ((DataFilm) -> Unit)? = null

    inner class ViewHolder(private val binding: ItemFilmBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.poster.setOnClickListener {
                onClick?.invoke(dataFilm[bindingAdapterPosition])
            }
        }

        fun bind(itemData: DataFilm) {
            binding.film = itemData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemFilmBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataFilm[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return dataFilm.size
    }


    @SuppressLint("NotifyDataSetChanged")
    fun setItemDataFilm(dataFilm: ArrayList<DataFilm>) {
        this.dataFilm.addAll(dataFilm)
    }
}