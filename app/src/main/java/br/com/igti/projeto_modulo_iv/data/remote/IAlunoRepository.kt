package br.com.igti.projeto_modulo_iv.data.remote

import br.com.igti.projeto_modulo_iv.data.remote.dto.AlunoRequestDTO
import br.com.igti.projeto_modulo_iv.data.remote.dto.AlunoResponseDTO
import br.com.igti.projeto_modulo_iv.data.remote.dto.MessageDTO
import okhttp3.Response
import retrofit2.Call
import retrofit2.http.*

interface IAlunoRepository {

    @GET("/alunos")
    fun listarAlunos() : Call<List<AlunoResponseDTO>>

    @GET("/alunos/{id}")
    fun listarAlunoPorId(@Path("id") id: String): Call<AlunoResponseDTO>

    @POST("/alunos/{id}")
    fun cadastrarAluno(@Body aluno : AlunoRequestDTO): Call<AlunoResponseDTO>

    @PUT("/alunos/{id}")
    fun alterarAluno(@Path("id") id: String, @Body aluno : AlunoRequestDTO) : Call<AlunoResponseDTO>

    @DELETE("/alunos/{id}")
    fun excluirAluno(@Path("id") id: String) : Call<Response>

    @GET("/helloworld")
    fun helloWorld(): Call<MessageDTO>

}