package br.com.igti.projeto_modulo_iv.data.remote

import br.com.igti.projeto_modulo_iv.data.remote.dto.AlunoRequestDTO
import br.com.igti.projeto_modulo_iv.data.remote.dto.AlunoResponseDTO
import br.com.igti.projeto_modulo_iv.data.remote.dto.MessageDTO
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface IAlunoRepository {

    @GET("/alunos")
    fun listarAlunos() : Call<List<AlunoResponseDTO>>

    @GET("/alunos/{id}")
    fun listarAlunoPorId(): Call<AlunoResponseDTO>

    @POST("/alunos/{id}")
    fun cadastrarAluno(@Body aluno : AlunoRequestDTO): Call<AlunoResponseDTO>

    fun alterarAluno()
    fun excluirAluno()

    @GET("/helloworld")
    fun helloWorld(): Call<MessageDTO>

}