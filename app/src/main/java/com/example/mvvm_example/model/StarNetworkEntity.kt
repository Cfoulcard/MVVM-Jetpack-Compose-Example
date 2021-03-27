package com.example.mvvm_example.model

import com.google.gson.annotations.SerializedName

class StarNetworkEntity(

    @SerializedName("title")
    var title: String? = null,

    @SerializedName("description")
    var description: String? = null
) {
}