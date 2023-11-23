package com.example.assistencias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class SlpashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val logo = findViewById<ImageView>(R.id.logo)

        logo.setOnClickListener(){
            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
            finish()

        }



    }
}