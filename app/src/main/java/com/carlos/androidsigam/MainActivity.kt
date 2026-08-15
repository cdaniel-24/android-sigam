package com.carlos.androidsigam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_inicio)

        // Se obtienen las vistas por su ID
        val btnGoToLogin: Button = findViewById(R.id.btnGoToLogin)
        val tvRegister: TextView = findViewById(R.id.tvRegister)

        // Evento para el botón Iniciar sesión
        btnGoToLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        // Evento para el texto de Registro
        tvRegister.setOnClickListener {
            Toast.makeText(this, "Opción de registro", Toast.LENGTH_SHORT).show()
        }
    }
}