package com.carlos.androidsigam

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)

        val etEmailForgot = findViewById<EditText>(R.id.etEmailForgot)
        val btnSendForgot = findViewById<Button>(R.id.btnSend)

        btnSendForgot.setOnClickListener {
            val email = etEmailForgot.text.toString().trim()

            if (email.isEmpty()) {
                Toast.makeText(this, "Por favor ingresa tu correo", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Enlace de recuperación enviado a $email", Toast.LENGTH_LONG).show()
                finish() // Cierra la pantalla y regresa al Login
            }
        }
    }
}