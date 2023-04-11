package com.example.tugas1_kelompok5

import android.media.Rating
import android.os.Parcel
import android.os.Parcelable

data class DataFilm(
    var judul: String,
    var release: String, var rating: String,
    var sinopsis: String, var img:Int):Parcelable
{
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt()
    ) {

    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
       parcel.writeString(judul)
       parcel.writeString(release)
       parcel.writeString(rating)
       parcel.writeString(sinopsis)
       parcel.writeInt(img)
    }

    companion object CREATOR : Parcelable.Creator<DataFilm> {
        override fun createFromParcel(parcel: Parcel): DataFilm {
            return DataFilm(parcel)
        }

        override fun newArray(size: Int): Array<DataFilm?> {
            return arrayOfNulls(size)
        }
    }

}