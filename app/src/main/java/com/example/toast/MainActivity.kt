package com.example.toast

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val toastButton = findViewById<Button>(R.id.buttonToast)
        toastButton.setOnClickListener {
            Toast.makeText(this, "Hi I am Toast 👌", Toast.LENGTH_LONG).show()
        }

    }
}