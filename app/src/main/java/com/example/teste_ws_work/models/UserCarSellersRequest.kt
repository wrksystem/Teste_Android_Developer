package com.example.teste_ws_work.models

import com.google.gson.annotations.SerializedName

data class UserCarSellersRequest(

    @SerializedName("id")
    val id: Int,
    @SerializedName("email")
    val email: String

)

