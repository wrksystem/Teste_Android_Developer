package com.example.teste_ws_work.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.teste_ws_work.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()
    }
}