package com.example.digitalhousefood_desafio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RestaurantesActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurantes2)
        title = "Digital House Foods"

        val meuRecyclerRestaurantes = findViewById<RecyclerView>(R.id.recyclerViewRestaurantes)
        val viewManager = LinearLayoutManager(this)

        val listaRestaurantes = listOf<Restaurantes>(
            Restaurantes(
                imagemRestaurante = R.drawable.tony_romas,
                nome = "Tony Roma´s",
                endereco = "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                horario = "Fecha às 22:00"
            ),
            Restaurantes(
                imagemRestaurante = R.drawable.ayoama,
                nome = "Aoyama - Moema",
                endereco = "Alameda dos Arapanés, 532 - Moema",
                horario = "Fecha às 00:00"
            ),
            Restaurantes(
                imagemRestaurante = R.drawable.outback,
                nome = "Outback - Moema",
                endereco = "Av. Moaci, 187, 187 - Moema, São Paulo",
                horario = "Fecha às 00:00"
            ),
            Restaurantes(
                imagemRestaurante = R.drawable.si_senhor,
                nome = "Sí Señor!",
                endereco = "Alameda Jauaperi, 626 - Moema",
                horario = "Fecha às 01:00"
            ),

            )


        val restauranteAdapter = RestaurantesAdapter(listaRestaurantes) {
            val intent = Intent(this, PratosPrincipaisActivity::class.java)
            startActivity(intent)
        }



        meuRecyclerRestaurantes.apply {
            setHasFixedSize(true)

            layoutManager = viewManager
            adapter = restauranteAdapter
        }
    }
}
