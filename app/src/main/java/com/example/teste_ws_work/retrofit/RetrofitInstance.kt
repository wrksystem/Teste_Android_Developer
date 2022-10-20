package com.example.teste_ws_work.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {

    companion object {
        val BASE_URL = ""

        fun getRetrofitInstance(): Retrofit.Builder {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())

        }
    }
}