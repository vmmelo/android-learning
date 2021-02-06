package com.example.aulasif1001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.aulasif1001.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // ActivityMainBinding se refere ao arquivo xml
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        R vem de resources (/res/layout/activity_main)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val botao = binding.button
        val texto = binding.texto
        val campoTexto = binding.campoTexto
        texto.text="Digite o texto"
        botao.setOnClickListener {
            val textoDigitado = campoTexto.text.toString()
            if(textoDigitado.isEmpty()){
                Log.d("UI WIDGETS", "Nada foi digitado")
                Toast.makeText(this, "Digita o texto ai cara de doido!", Toast.LENGTH_LONG).show()
            } else {
                texto.text = textoDigitado
            }
        }

    }
}