package com.example.digitalhousefood_desafio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PratosPrincipaisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pratos_principais)

        val recyclerPratos = findViewById<RecyclerView>(R.id.recyclerPratos)
        val viewManagerPratos = GridLayoutManager(this, 2)
        val viewAdapterPratos = PratosAdapter(
            arrayListOf<Pratos>(
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
        )
//        recyclerPratos.apply {
//            layoutManager = viewManagerPratos
//            adapter = viewAdapterPratos
//
//            setHasFixedSize(true)
    //    }
    }
}