package com.example.digitalhousefood_desafio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PratosPrincipaisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pratos_principais)
        this.title = ""


        val recyclerPratos = findViewById<RecyclerView>(R.id.recyclerPratos)
        val viewManagerPratos = GridLayoutManager(this, 2)

         val pratosPrincipais = listOf<Pratos>(
            Pratos("Salada com molho Gengibre", fotoPrato = R.drawable.ayoama),
            Pratos("Salada com molho Gengibre", fotoPrato = R.drawable.ayoama),
            Pratos("Salada com molho Gengibre", fotoPrato = R.drawable.ayoama),
            Pratos("Salada com molho Gengibre", fotoPrato = R.drawable.ayoama),
            Pratos("Salada com molho Gengibre", fotoPrato = R.drawable.ayoama),
            Pratos("Salada com molho Gengibre", fotoPrato = R.drawable.ayoama),
            Pratos("Salada com molho Gengibre", fotoPrato = R.drawable.ayoama),
            Pratos("Salada com molho Gengibre", fotoPrato = R.drawable.ayoama),
            Pratos("Salada com molho Gengibre", fotoPrato = R.drawable.ayoama),
            Pratos("Salada com molho Gengibre", fotoPrato = R.drawable.ayoama)
        )


        val viewAdapterPratos = PratosAdapter(pratosPrincipais) {
            val intent = Intent(this, DescricaoPratoActivity::class.java)
            startActivity(intent)
        }

        recyclerPratos.apply {
            layoutManager = viewManagerPratos
            adapter = viewAdapterPratos

            setHasFixedSize(true)
        }
    }
}