package com.example.teste_ws_work.retrofit

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {

    companion object {
        private var retrofitService: RetrofitService? = null

        fun getInstance() : RetrofitService {
            if (retrofitService == null) {
                var gson: Gson = GsonBuilder()
                    .setLenient()
                    .create()

                val retrofit = Retrofit.Builder()
                    .baseUrl("https://wswork.com.br/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
                retrofitService = retrofit.create(RetrofitService::class.java)
            }
            return retrofitService!!
        }

    }

}


