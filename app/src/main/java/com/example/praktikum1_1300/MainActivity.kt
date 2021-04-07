package com.example.praktikum1_1300

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.btn_login)

        btnLogin.setOnClickListener {
            val intentHome = Intent(this, HomeActivity::class.java)
            startActivity(intentHome)
        }
    }
}