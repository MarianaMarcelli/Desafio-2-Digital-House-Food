package com.example.digitalhousefood_desafio2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

class Register1Fragment : Fragment() {

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_register1, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        view.findViewById<Button>(R.id.btnRegisterRegister).setOnClickListener {

            val name = view.findViewById<EditText>(R.id.edtNameRegister)
            val email = view.findViewById<EditText>(R.id.edtEmailRegister)
            val password = view.findViewById<EditText>(R.id.edtPasswordRegister)
            val repeatePassword = view.findViewById<EditText>(R.id.textRepeatPassword)





            navController.navigate(R.id.action_register1Fragment_to_restaurantFragment)
        }

    }
}