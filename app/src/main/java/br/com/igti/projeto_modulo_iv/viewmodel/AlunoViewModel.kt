package br.com.igti.projeto_modulo_iv.viewmodel

import androidx.lifecycle.ViewModel
import br.com.igti.projeto_modulo_iv.data.remote.dto.AlunoRequestDTO

class AlunoViewModel : ViewModel() {

    fun listarAlunos(){
        //TODO Repository.get()
    }

    fun listarAlunoPorId(id:String){
        //TODO repository.getById(id)
    }

    fun cadastrarAluno(alunoRequestDTO: AlunoRequestDTO){
        //TODO repository.post(aluno)
    }

    fun alterarAlunos(id:String, aluno :AlunoRequestDTO){
        //TODO repository.put(id, Aluno)
    }

    fun excluirAluno(id: String){
        //TODO repository.delete(id)
    }

}