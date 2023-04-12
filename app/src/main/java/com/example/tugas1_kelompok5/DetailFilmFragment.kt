package com.example.tugas1_kelompok5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tugas1_kelompok5.databinding.FragmentDetailFilmBinding



@Suppress("DEPRECATION")
class DetailFilmFragment : Fragment() {

    lateinit var binding : FragmentDetailFilmBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentDetailFilmBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var getdataFilm = arguments?.getSerializable("BUNDLE")as DataFilm
        binding.imgFilm.setImageResource(getdataFilm.img)
        binding.judulfilm.text = getdataFilm.judul
        binding.relase.text = getdataFilm.release
        binding.rating.text = getdataFilm.rating
        binding.deskripsi.text = getdataFilm.sinopsis
    }


}