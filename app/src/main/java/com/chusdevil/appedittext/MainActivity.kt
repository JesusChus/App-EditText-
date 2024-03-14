package com.chusdevil.appedittext

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciar()
    }

    private fun iniciar() {
        val boton : Button = findViewById(R.id.boton)
        val texto : EditText = findViewById(R.id.etTexto)

        boton.setOnClickListener {
            val texto = texto.text.toString()
            val intent = Intent(this,SegundaActivity::class.java)
            intent.putExtra("texto", texto)
            startActivity(intent)
        }
    }

}