package com.example.digitalhousefood_desafio2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PratosAdapter(private val dataSet: List<Pratos>, private val listener: (Pratos) -> Unit) :
    RecyclerView.Adapter<PratosAdapter.PratosViewHolder>() {

    class PratosViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val nomePrato by lazy { view.findViewById<TextView>(R.id.txtNomePrato) }
        private val fotoPrato by lazy { view.findViewById<ImageView>(R.id.fotoPrato) }

        fun bind(prato: Pratos) {
            nomePrato.text = prato.nome
            fotoPrato.setImageResource(prato.fotoPrato)
        }
    }

    override fun getItemCount() = dataSet.size

    override fun onBindViewHolder(holder: PratosViewHolder, position: Int) {
        val item = dataSet[position]
        holder.bind(item)

        holder.itemView.setOnClickListener {
            listener(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PratosViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.modelo_prato, parent, false)

        return PratosViewHolder(view)
    }
}