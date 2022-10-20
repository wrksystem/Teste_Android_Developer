package com.example.teste_ws_work.retrofit

import com.example.teste_ws_work.models.DataCarList
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServiceInterface {

    @GET("cars.json")
    fun getCarList(): Call<List<DataCarList>>
}