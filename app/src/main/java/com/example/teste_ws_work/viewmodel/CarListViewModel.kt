package com.example.teste_ws_work.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.teste_ws_work.models.DataCarList
import com.example.teste_ws_work.retrofit.RetrofitInstance
import com.example.teste_ws_work.retrofit.RetrofitServiceInterface

class CarListViewModel: ViewModel() {

    lateinit var liveDataList: MutableLiveData<List<DataCarList>>

    init {
        liveDataList = MutableLiveData()
    }

    fun getLiveDataObserver(): MutableLiveData<List<DataCarList>> {
        return liveDataList
    }

    fun makeAPICall(){
        val retrofitInstance = RetrofitInstance.getRetrofitInstance()
        val retrofitService = retrofitInstance.(RetrofitServiceInterface::class.java)
    }
}