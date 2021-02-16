package com.example.recyclerview

import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.LinhaBinding

class ProfessorViewHolder (private val binding: LinhaBinding) : RecyclerView.ViewHolder(binding.root) {
    var nome:String = "Algum nome"
    var login:String = "Algum login"

    init {
        binding.root.setOnClickListener {
            val contexto = binding.nome.context
            val i = Intent(contexto, ProfessorActivity::class.java)

            i.putExtra("nome", nome)
            i.putExtra("login", login)

            contexto.startActivity(i)
        }
    }
    fun bindTo(professor: Professor) {
        nome = professor.nome
        login = professor.login

        binding.nome.text = professor.nome
        binding.login.text = professor.login
        if(professor.login == "suruagy") {
            binding.icone.setImageResource(R.drawable.github)
        } else {
            binding.icone.setImageResource(R.drawable.bitbucket)
        }
    }
}