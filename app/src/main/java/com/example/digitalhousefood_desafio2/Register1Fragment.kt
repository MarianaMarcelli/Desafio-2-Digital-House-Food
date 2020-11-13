package com.example.digitalhousefood_desafio2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputEditText

class Register1Fragment : Fragment() {

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

            var todosCamposValidos = true

            val name = view.findViewById<EditText>(R.id.editNameRegister)
            val email = view.findViewById<EditText>(R.id.editEmailRegister)
            val password = view.findViewById<EditText>(R.id.editTextPassword)
            val repeatePassword = view.findViewById<EditText>(R.id.editTextRepeatPassword)


            if (name.text.toString().isBlank()) {
                name.error = "Campo vazio"
                todosCamposValidos = false
            }

            if (email.text.toString().isBlank()) {
                email.error = "Campo vazio"
                todosCamposValidos = false
            }
            if (password.text.toString().isBlank()) {
                password.error = "Campo vazio"
                todosCamposValidos = false
            }
            if (repeatePassword.text.toString().isBlank()) {
                repeatePassword.error = "Campo Vazio"
                todosCamposValidos = false
            } else if (repeatePassword.text.toString() != password.text.toString()) {
                repeatePassword.error = "Repita a senha digitada anteriorente"
               todosCamposValidos = false
            }

            if (todosCamposValidos) {
                name.text.clear()
                email.text.clear()
                password.text.clear()
                repeatePassword.text.clear()


                navController.navigate(R.id.action_register1Fragment_to_restaurantesActivity2)
            }

        }


    }

}
