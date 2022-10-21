package com.example.teste_ws_work.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.teste_ws_work.models.Car
import com.example.teste_ws_work.repository.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CarListViewModel constructor(private val repository: Repository) : ViewModel() {

    val carList = MutableLiveData<List<Car>>()
    val errorMessage = MutableLiveData<String>()

    fun getCarList() {
        val response = repository.getCarList()
        response.enqueue(object : Callback<List<Car>> {
            override fun onResponse(
                call: Call<List<Car>>,
                response: Response<List<Car>>
            ) {
                carList.postValue(response.body())

            }

            override fun onFailure(call: Call<List<Car>>, t: Throwable) {
                errorMessage.postValue(t.message)
            }


        })
    }
}

