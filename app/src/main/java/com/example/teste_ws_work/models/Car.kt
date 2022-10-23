package com.example.teste_ws_work.models
import com.google.gson.annotations.SerializedName

data class Car(

    @SerializedName("ano")
    val ano: Int,
    @SerializedName("combustivel")
    val combustivel: String,
    @SerializedName("cor")
    val cor: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("marca_id")
    val marca_id: Int,
    @SerializedName("marca_nome")
    val marca_nome: String,
    @SerializedName("nome_modelo")
    val nome_modelo: String,
    @SerializedName("num_portas")
    val num_portas: Int,
    @SerializedName("timestamp_cadastro")
    val timestamp_cadastro: Int,
    @SerializedName("valor_fipe")
    val valor_fipe: String

)



