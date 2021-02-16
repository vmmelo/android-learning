package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityProfessorBinding

class ProfessorActivity : AppCompatActivity() {
    private lateinit var binding : ActivityProfessorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfessorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nome = intent.getStringExtra("nome")
        val login = intent.getStringExtra("login")

        binding.nomeProfessor.text = nome
        binding.loginProfessor.text = login

    }
}