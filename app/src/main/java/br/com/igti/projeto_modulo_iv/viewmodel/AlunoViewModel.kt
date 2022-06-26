package br.com.igti.projeto_modulo_iv.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.igti.projeto_modulo_iv.data.remote.dto.AlunoRequestDTO
import br.com.igti.projeto_modulo_iv.data.remote.dto.AlunoResponseDTO
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.LocalDateTime

class AlunoViewModel(
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO) : ViewModel(
) {

    private val _listaAlunos : MutableLiveData<List<AlunoResponseDTO>> = MutableLiveData()
    val listaAlunos : LiveData<List<AlunoResponseDTO>> = _listaAlunos

    private val _listaAlunoFlow = MutableStateFlow<List<AlunoResponseDTO>>(listOf())
    val listaAlunosFlow : StateFlow<List<AlunoResponseDTO>> = _listaAlunoFlow

    fun listarAlunos(){
        viewModelScope.launch(dispatcher){
        val listaDeAlunos = listOf(
            AlunoResponseDTO(
                "a123",
                "Gabriel",
                "Marinho",
                LocalDate.parse("07-12-2001"),
                LocalDateTime.now()
            ),
            AlunoResponseDTO(
                "a123",
                "Gabriel",
                "Marinho",
                LocalDate.parse("07-12-2001"),
                LocalDateTime.now()
            )
        )
        _listaAlunos.value = listaDeAlunos
        _listaAlunoFlow.value = listaDeAlunos
        //TODO Repository.get()
        }

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