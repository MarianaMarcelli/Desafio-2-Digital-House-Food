package com.example.digitalhousefood_desafio2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

class Login1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        view.findViewById<Button>(R.id.btnLogin).setOnClickListener {
            var camposValidos = true

            val emailLogin = view.findViewById<EditText>(R.id.edtEmailLogin)
            val passwordLogin = view.findViewById<EditText>(R.id.edtPasswordLogin)

            if (emailLogin.text.toString().isBlank()) {
                emailLogin.error = "Campo vazio"
                camposValidos = false
            }
            if (passwordLogin.text.toString().isBlank()) {
                passwordLogin.error = "Campo vazio"
                camposValidos = false
            }
            if (camposValidos) {
                emailLogin.text?.clear()
                passwordLogin.text?.clear()

                navController.navigate(R.id.action_login1Fragment_to_restaurantesActivity2)
            }
        }
        view.findViewById<Button>(R.id.btnREGISTER).setOnClickListener {
            navController.navigate(R.id.action_login1Fragment_to_register1Fragment)
        }
    }
}


