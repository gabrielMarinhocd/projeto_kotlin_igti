package br.com.igti.projeto_modulo_iv.ui.alunos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.igti.projeto_modulo_iv.R
import br.com.igti.projeto_modulo_iv.data.remote.dto.AlunoResponseDTO

class AlunoAdapter (private val dataSet: List<AlunoResponseDTO>) :
        RecyclerView.Adapter<AlunoAdapter.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val txtNome: TextView
            val txtSobrenome: TextView

            init {
                txtNome = view.findViewById(R.id.txtNome)
                txtSobrenome = view.findViewById(R.id.txtSobrenome)
            }
        }


        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int) =
             ViewHolder(
                 LayoutInflater
                     .from(viewGroup.context)
                     .inflate(R.layout.aluno_item_row, viewGroup, false)
                 )


        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
            viewHolder.txtNome.text = dataSet[position].nome
            viewHolder.txtNome.text = dataSet[position].sobrenome
        }

        override fun getItemCount() = dataSet.size

    }

}