package com.example.tugas1_kelompok5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tugas1_kelompok5.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    lateinit var setvm: setVM
    lateinit var adapterFilm: AdapterFilm
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapterFilm = AdapterFilm(ArrayList())
        binding.rvFilm.layoutManager = GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)
        binding.rvFilm.adapter = adapterFilm
        adapterFilm.onClick={
            var bundle = Bundle()
            bundle.putSerializable("BUNDLE", it)
            findNavController().navigate(R.id.action_homeFragment_to_detailFilmFragment, bundle)
        }
        setvm = ViewModelProvider(this).get(setVM::class.java)
        setvm.getData()

        val getNama = arguments?.getString("NAMA")
        setvm.getDataFilm.observe(viewLifecycleOwner, Observer {
            adapterFilm.setItemDataFilm(it as ArrayList<DataFilm>)
        })
        binding.imgProfil.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("NAMA", getNama)
            findNavController().navigate(R.id.action_homeFragment_to_profileFragment, bundle)
        }
    }



}