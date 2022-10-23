package com.example.teste_ws_work.retrofit

import com.example.teste_ws_work.models.Car
import com.example.teste_ws_work.models.UserCarSellersRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface RetrofitService {

    @Headers( "Content-Type: application/json" )
    @GET("cars.json")
    fun getCarList(): Call<List<Car>>

    @POST("cars/leads/")
    fun  putCarUser(@Body car: UserCarSellersRequest): Call<Unit>
}