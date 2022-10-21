package com.example.teste_ws_work.retrofit

import com.example.teste_ws_work.models.Car
import com.example.teste_ws_work.models.DataCarList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface RetrofitService {
    @Headers( "Content-Type: application/json" )
    @GET("cars")
    fun getCarList(): Call<List<Car>>
}