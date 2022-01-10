package com.example.myapplication.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.R

class nicefragment1 : Fragment(R.layout.nicefraagment1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sendButton = view.findViewById<Button>(R.id.buttonClick)
        val amountEditText = view.findViewById<EditText>(R.id.editTextAmount)

        val controller = Navigation.findNavController(view )

        sendButton.setOnClickListener {

            val amountText  = amountEditText.text.toString()
            if (amountText.isEmpty()) {
                return@setOnClickListener
            }
            val amount = amountText.toInt()



        }
    }
}