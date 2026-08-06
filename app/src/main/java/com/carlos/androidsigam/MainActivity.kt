package com.carlos.androidsigam

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.carlos.androidsigam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // paso 1 declarar un variable de tipo binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // paso 2 almacenar la actividad que quiero manejar
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root) // paso 3 lo coloco en el root

        binding.btn1.setOnClickListener { // activamos del evento click boton 1
            Toast.makeText(this, "click en el primer boton", Toast.LENGTH_SHORT).show()
        }

        binding.btn2.setOnClickListener { // activamos el evento del boton 2
            Toast.makeText(this, "haz click en el boton 2", Toast.LENGTH_SHORT).show()
        }

        binding.btn3.setOnClickListener { // activamos el evento del boton 3
            Toast.makeText(this, "haz click en el boton 3", Toast.LENGTH_SHORT).show()
        }
    }
}