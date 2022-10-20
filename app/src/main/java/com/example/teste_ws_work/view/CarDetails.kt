package com.example.teste_ws_work.view

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.teste_ws_work.R

class CarDetails : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_details)
        supportActionBar!!.hide()

        val recyclerView_cars = findViewById<RecyclerView>(R.id.recyclerView_cars)
        recyclerView_cars.layoutManager = LinearLayoutManager(this)
        recyclerView_cars.setHasFixedSize(true)
    }
}