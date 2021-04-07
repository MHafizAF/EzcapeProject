package com.example.praktikum1_1300

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    lateinit var btnOpenBrowser: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnOpenBrowser = findViewById(R.id.btn_open_browser)

        btnOpenBrowser.setOnClickListener {
            val intentOpenUrl = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/mhafiz_021/"))
            startActivity(intentOpenUrl)
        }
    }
}