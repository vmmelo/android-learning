package com.example.recyclerview

import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.LinhaBinding

class ProfessorViewHolder (private val binding: LinhaBinding) : RecyclerView.ViewHolder(binding.root) {
    init {
        binding.root.setOnClickListener {
            val contexto = binding.nome.context
            contexto.startActivity(Intent(contexto, ProfessorActivity::class.java))
        }
    }
    fun bindTo(professor: Professor) {
        binding.nome.text = professor.nome
        binding.login.text = professor.login
        if(professor.login == "suruagy") {
            binding.icone.setImageResource(R.drawable.github)
        } else {
            binding.icone.setImageResource(R.drawable.bitbucket)
        }
    }
}