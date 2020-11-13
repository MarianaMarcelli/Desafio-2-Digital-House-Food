package com.example.digitalhousefood_desafio2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RestaurantesAdapter(private val dataSet: List<Restaurantes>, private val listener: (Restaurantes) ->Unit) :
    RecyclerView.Adapter<RestaurantesAdapter.RestaurantesViewHolder>() {

    class RestaurantesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val nomeRestaurante by lazy { view.findViewById<TextView>(R.id.nomeRestaurante) }
        private val endereco by lazy { view.findViewById<TextView>(R.id.enderecoRestaurante) }
        private val horario by lazy { view.findViewById<TextView>(R.id.horarioRestaurante) }
        private val imagem by lazy { view.findViewById<ImageView>(R.id.imagemRestaurante) }


        fun bind(restaurante: Restaurantes) {
            nomeRestaurante.text = restaurante.nome
            endereco.text = restaurante.endereco
            horario.text = restaurante.horario
            imagem.setImageResource(restaurante.imagemRestaurante)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.modelo_restaurante, parent, false)

        return RestaurantesViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantesViewHolder, position: Int) {
       val item = dataSet[position]
        holder.bind(item)

        holder.itemView.setOnClickListener { listener(item) }
    }

    override fun getItemCount() = dataSet.size

}