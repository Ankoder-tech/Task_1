package com.example.myappui

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class RegisterFragment : Fragment(R.layout.fragment_register) {

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        val alreadyAccount =
            view.findViewById<TextView>(R.id.already_account)

        alreadyAccount.setOnClickListener {

            findNavController().navigate(
                R.id.action_register_to_login
            )
        }
    }
}