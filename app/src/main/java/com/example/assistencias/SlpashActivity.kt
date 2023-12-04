package com.example.assistencias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class SlpashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        splashScreen.setKeepOnScreenCondition {true}
        val intent = Intent(this, AuthActivity::class.java)
        startActivity(intent)
        finish()

    }
}