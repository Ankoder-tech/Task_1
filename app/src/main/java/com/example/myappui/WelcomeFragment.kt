package com.example.myappui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        val loginButton = view.findViewById<Button>(R.id.loginButton)
        val registerButton = view.findViewById<Button>(R.id.registerButton)

        loginButton.setOnClickListener {

            findNavController().navigate(
                R.id.action_welcome_to_login
            )
        }
        registerButton.setOnClickListener {
            findNavController().navigate(
                R.id.action_welcome_to_register
            )
        }
    }
}