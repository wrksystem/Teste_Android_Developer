package com.example.teste_ws_work.repository

import com.example.teste_ws_work.retrofit.RetrofitService

class Repository constructor(private val retrofitService: RetrofitService) {

    fun getCarList() = retrofitService.getCarList()

}