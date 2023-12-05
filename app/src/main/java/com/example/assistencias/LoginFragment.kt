package com.example.assistencias

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
                val estado = validateData(etx_user.text.toString(), etx_password.text.toString(), UserProvider.users )
                if(estado){
                    Toast.makeText(root.context, "Welcome", Toast.LENGTH_SHORT).show()
                    val i = Intent(root.context,MainActivity::class.java)
                    startActivity(i)
                    activity?.finish()
                }else{
                    Toast.makeText(root.context, "Bad Credentials", Toast.LENGTH_SHORT).show()
                }
                //findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
            }else{
                Toast.makeText(root.context, "Bad Credentials", Toast.LENGTH_SHORT).show()
            }
        }

        return root
    }
    private fun validateData(login_email:String, login_pass:String, users:List<User>): Boolean {
        return users.any(){
            user -> user.email == login_email && login_pass == user.password
        }
    }
}