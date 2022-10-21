package com.example.teste_ws_work.models

data class Car(
    val ano: Int,
    val combustivel: String,
    val cor: String,
    val id: Int,
    val marca_id: Int,
    val marca_nome: String,
    val nome_modelo: String,
    val num_portas: Int,
    val timestamp_cadastro: Int,
    val valor_fipe: Double
)