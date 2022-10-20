package com.example.teste_ws_work.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teste_ws_work.R

class FormRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_register)
        supportActionBar!!.hide()
    }
}