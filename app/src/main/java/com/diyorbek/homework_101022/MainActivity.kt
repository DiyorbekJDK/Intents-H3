package com.diyorbek.homework_101022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view: ImageView = findViewById(R.id.imageView)
        view.setOnClickListener {
            val intent = Intent(this, Second::class.java)
            startActivity(intent)
            finish()
        }

    }
}