package com.carlos.androidsigam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio_sesion)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvForgotPassword = findViewById<TextView>(R.id.tvForgotPassword)

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor llena todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "¡Bienvenido a SIGAM!", Toast.LENGTH_SHORT).show()
            }
        }

        // codigo de navegacion pantalla 3 :
        tvForgotPassword.setOnClickListener {
            val intent = Intent(this, PasswordActivity::class.java)
            startActivity(intent)
        }
    }
}