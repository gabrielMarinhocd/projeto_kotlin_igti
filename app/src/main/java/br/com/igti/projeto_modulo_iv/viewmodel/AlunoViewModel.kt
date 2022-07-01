package br.com.igti.projeto_modulo_iv.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.igti.projeto_modulo_iv.data.remote.AlunoRepository
import br.com.igti.projeto_modulo_iv.data.remote.RetrofitClient
import br.com.igti.projeto_modulo_iv.data.remote.dto.AlunoRequestDTO
import br.com.igti.projeto_modulo_iv.data.remote.dto.AlunoResponseDTO
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response
import java.time.LocalDate
import java.time.LocalDateTime
import javax.security.auth.callback.Callback

class AlunoViewModel(
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO) : ViewModel(
) {

    private val repository: AlunoRepository = AlunoRepository(RetrofitClient())

    private val _listaAlunoFlow = MutableStateFlow<List<AlunoResponseDTO>>(listOf())
    val listaAlunosFlow : StateFlow<List<AlunoResponseDTO>> = _listaAlunoFlow

    fun listarAlunos(){
        viewModelScope.launch(dispatcher){
            repository.listarAlunos().enqueue(object : retrofit2.Callback<List<AlunoResponseDTO>>{
                override fun onResponse(
                    call: Call<List<AlunoResponseDTO>>,
                    response: Response<List<AlunoResponseDTO>>
                ) {
                    if (response.isSuccessful){
                        response.body()?.let{
                            _listaAlunoFlow.value = it
                        }
                    }
                }

                override fun onFailure(call: Call<List<AlunoResponseDTO>>, t: Throwable) {
                    _listaAlunoFlow.value = listOf()
                    Log.e(AlunoViewModel::class.java.name, t.toString())
                }

            })
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