package com.example.teste_ws_work.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.teste_ws_work.adapter.CarAdapter
import com.example.teste_ws_work.databinding.ActivityMainBinding
import com.example.teste_ws_work.repository.Repository
import com.example.teste_ws_work.retrofit.RetrofitInstance
import com.example.teste_ws_work.viewmodel.CarListViewModel
import com.example.teste_ws_work.viewmodel.CarViewModelFactory

class MainActivity : AppCompatActivity() {


    private val TAG = "MainActivity"
    private lateinit var binding: ActivityMainBinding
    lateinit var viewModel: CarListViewModel
    private val retrofitService = RetrofitInstance.getInstance()
    val adapter = CarAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        viewModel = ViewModelProvider(this,
            CarViewModelFactory(Repository(retrofitService)))[CarListViewModel::class.java]

        binding.recyclerViewCars.adapter = adapter
        viewModel.carList.observe(this, Observer {
            Log.d(TAG, "onCreate: $it")
            adapter.setCarList(it)
        })
        viewModel.errorMessage.observe(this, Observer {
            Log.d(TAG, "Error: $it")
        })
        viewModel.getCarList()

    }

}