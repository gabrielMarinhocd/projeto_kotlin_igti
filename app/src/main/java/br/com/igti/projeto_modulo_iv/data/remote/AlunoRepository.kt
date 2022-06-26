package br.com.igti.projeto_modulo_iv.data.remote

import br.com.igti.projeto_modulo_iv.data.remote.dto.AlunoRequestDTO
import br.com.igti.projeto_modulo_iv.data.remote.dto.AlunoResponseDTO
import br.com.igti.projeto_modulo_iv.data.remote.dto.MessageDTO
import okhttp3.Response
import retrofit2.Call

class AlunoRepository : IAlunoRepository{
    override fun listarAlunos(): Call<List<AlunoResponseDTO>> {
        TODO("Not yet implemented")
    }

    override fun listarAlunoPorId(): Call<AlunoResponseDTO> {
        TODO("Not yet implemented")
    }

    override fun cadastrarAluno(aluno: AlunoRequestDTO): Call<AlunoResponseDTO> {
        TODO("Not yet implemented")
    }

    override fun alterarAluno(aluno: AlunoRequestDTO): Call<AlunoResponseDTO> {
        TODO("Not yet implemented")
    }

    override fun excluirAluno(): Call<Response> {
        TODO("Not yet implemented")
    }

    override fun helloWorld(): Call<MessageDTO> {
        TODO("Not yet implemented")
    }


}