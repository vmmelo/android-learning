package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.LinhaBinding


class ProfessorAdapter(
    private val professores: Array<Professor>,
    private val inflater: LayoutInflater
) : RecyclerView.Adapter<ProfessorViewHolder>() {

    // infla o xml, vai criar o objeto viewholder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfessorViewHolder {
        val binding = LinhaBinding.inflate(inflater, parent, false)
        return ProfessorViewHolder(binding)
    }

    // o objeto viewholder já foi criado, e agora vai ser exibido o widget
    override fun onBindViewHolder(holder: ProfessorViewHolder, position: Int) {
        holder.bindTo(professores[position])
    }
    // precisa saber a quantidade de elementos que essa lista vai ter
    override fun getItemCount() = professores.size
}