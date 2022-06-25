package br.com.igti.projeto_modulo_iv.data.remote

class AlunoRepository : IAlunoRepository{
    override fun getAlunos(): List<String> {
        return  listOf("123", "789")
    }
}