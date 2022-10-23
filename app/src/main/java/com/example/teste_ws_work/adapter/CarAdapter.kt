package com.example.teste_ws_work.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.teste_ws_work.adapter.CarAdapter.CarViewHolder
import com.example.teste_ws_work.databinding.ItemCarBinding
import com.example.teste_ws_work.models.Car
import com.example.teste_ws_work.viewmodel.CarListViewModel

class CarAdapter() : RecyclerView.Adapter<CarViewHolder>() {

    private val cars = arrayListOf<Car>()

    fun setCarList(cars: List<Car>) {
        this.cars.addAll(cars)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCarBinding.inflate(inflater, parent, false)
        return CarViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val car = cars[position]
        holder.binding(car)
        /*holder.itemView.setOnClickListener{
            itemClick.detailData(car)
        }*/
    }

    override fun getItemCount(): Int {
        return cars.size
    }

    class CarViewHolder(val binding: ItemCarBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun binding(car: Car) {
            binding.tvCarItem.text = car.nome_modelo

        }
    }
}