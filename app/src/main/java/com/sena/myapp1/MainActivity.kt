package com.sena.myapp1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn: Button = findViewById(R.id.button3)
        btn.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }

        val tex1: TextView = findViewById(R.id.textView5)
        tex1.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

        }


    }
}