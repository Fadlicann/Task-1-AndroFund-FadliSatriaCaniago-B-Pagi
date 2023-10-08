package com.example.latihan

import android.os.Parcelable
import kotlin.android.parcel.Parcelize

@Parcelize

data class User(
    val username:String,
    val password:String

):Parcelable
