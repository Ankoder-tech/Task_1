package com.example.myappui

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        val createAccount =
            view.findViewById<TextView>(R.id.createAccount)

        createAccount.setOnClickListener {

            findNavController().navigate(
                R.id.action_login_to_register
            )
        }
    }
}