package com.example.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.LinhaBinding

class ProfessorViewHolder (private val binding: LinhaBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bindTo(professor: Professor) {
        binding.nome.text = professor.nome
        binding.login.text = professor.login
        if(professor.login === "lmt") {

        }
    }
}