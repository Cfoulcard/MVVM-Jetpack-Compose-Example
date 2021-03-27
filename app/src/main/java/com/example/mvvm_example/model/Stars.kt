package com.example.mvvm_example.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Stars(
    val title: String? = null,
    val description: String? = null,
) : Parcelable
