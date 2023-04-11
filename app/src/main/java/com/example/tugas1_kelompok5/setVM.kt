package com.example.tugas1_kelompok5

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class setVM:ViewModel() {
    val listData = arrayListOf(
        DataFilm("Spider Man Far From Home","Release: 03/07/2019", "Rating: 7.4/10", "Sinopsis: Peter Parker (Tom Holland) tengah mengunjungi Eropa untuk liburan panjang bersama temaan-temanya. Sayangnya , Parker tidak bisa dengan tenang menikmati liburannya, karena Nick Fury datang secara tiba-tiba di kamar hotelnya. Selama di Eropa pun Peter harus menghadapi banyak musuh mulai dari Hydro Man, Sandman dan Molten Man.", R.drawable.ffh),
        DataFilm("Jhon Wick 4","Release: 21/03/2023", "Rating: 8.3/10", "Sinopsis: John Wick (Keanu Reeves) menemukan jalan untuk mengalahkan The High Table. Tapi sebelum dia bisa mendapatkan kebebasannya, Wick harus berhadapan dengan musuh baru dengan aliansi yang kuat di seluruh dunia! Memaksanya mengubah teman lama menjadi musuh.", R.drawable.jw),
        DataFilm("Fast X","Release: 19/05/2023","Rating: Unknown", "Sinopsis: Fast X adalah film aksi Amerika mendatang yang disutradarai oleh Louis Leterrier dari skenario oleh Justin Lin, Zach Dean, dan Dan Mazeau. Ini adalah sekuel F9, berfungsi sebagai angsuran utama kesepuluh dan kedua dari belakang, dan film berdurasi penuh kesebelas dalam franchise Fast & Furio", R.drawable.ff),
        DataFilm("Avenger: Endgame","Release: 24/04/2019","Rating: 8.4/10","Sinopsis: Melanjutkan Avengers Infinity War, dimana kejadian setelah Thanos berhasil mendapatkan semua infinity stones dan memusnahkan 50% semua mahluk hidup di alam semesta. Akankah para Avengers berhasil mengalahkan Thanos?", R.drawable.endgame)
    )

    val getDataFilm: MutableLiveData<List<DataFilm>> = MutableLiveData()

    fun getData(){
        getDataFilm.value = listData
    }
}
