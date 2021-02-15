package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Como os elementos vão ser organizados
        binding.listaElementos.layoutManager = LinearLayoutManager(this)

        // decorando elementos com separados
        binding.listaElementos.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )

        /** Adapter recebe dados e vai adaptar esses dados para outra função, outro papel
         Neste caso, o adapter vai receber uma coleção de dados e vai construir a representação visual desses objetos para ser exibido na tela
        */
        binding.listaElementos.adapter = ProfessorAdapter(Constants.professores, layoutInflater)
    }
}