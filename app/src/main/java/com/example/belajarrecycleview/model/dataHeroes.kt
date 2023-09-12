package com.example.belajarrecycleview.model

import android.media.Image
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class dataHeroes(
    val name: String,
    val description: String,
    val image: Int
) : Parcelable