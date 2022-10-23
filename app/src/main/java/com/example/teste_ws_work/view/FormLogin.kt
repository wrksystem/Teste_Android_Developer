package com.example.teste_ws_work.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.teste_ws_work.R

class FormLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)

        supportActionBar!!.hide()

        val text_tv_register = findViewById<TextView>(R.id.text_tv_register)
        val btLogin = findViewById<Button>(R.id.bt_login)

        btLogin.setOnClickListener {
            val intent = Intent(this@FormLogin, MainActivity::class.java)
            startActivity(intent)
        }

             text_tv_register!!.setOnClickListener {
                 val intent = Intent(this@FormLogin, FormRegister::class.java)
                 startActivity(intent)
             }
    }

 }
