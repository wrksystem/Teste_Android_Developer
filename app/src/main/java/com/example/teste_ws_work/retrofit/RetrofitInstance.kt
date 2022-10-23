package com.example.teste_ws_work.retrofit

import android.util.Log
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {

    companion object {
        private var retrofitService: RetrofitService? = null

        fun getInstance() : RetrofitService {
            if (retrofitService == null) {

                val client = OkHttpClient.Builder()
                    .addInterceptor(HttpLoggingInterceptor{
                        Log.i("não passou", it)
                    })
                    .build()

                val gson: Gson = GsonBuilder()
                    .setLenient()
                    .create()

                val retrofit =  Retrofit.Builder()
                    .client(client)
                    .baseUrl("https://wswork.com.br/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

                retrofitService = retrofit.create(RetrofitService::class.java)

            }
            return retrofitService!!

        }

    }

}


