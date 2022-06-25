package br.com.igti.projeto_modulo_iv.data.remote

import br.com.igti.projeto_modulo_iv.data.remote.dto.MessageDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.PATCH

interface IAlunoRepository {
    fun listarAlunos()
    fun listarAlunoPorId()
    fun cadastrarAluno()
    fun alterarAluno()
    fun excluirAluno()

    @GET
    @PATCH('/helloworld')
    fun helloWorld(): Call<MessageDTO>

}