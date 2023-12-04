package com.example.assistencias

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_login, container, false)
        val btnLogin = root.findViewById<Button>(R.id.btnLogin)
        val etx_user = root.findViewById<EditText>(R.id.etxuser)
        val etx_password = root.findViewById<EditText>(R.id.etxpassword)

        btnLogin.setOnClickListener(){
            if(!etx_user.text.isNullOrEmpty() && !etx_password.text.isNullOrEmpty()) {
                val i = Intent(root.context,MainActivity::class.java)
                startActivity(i)
                activity?.finish()
                //findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
            }
        }

        return root
    }
}