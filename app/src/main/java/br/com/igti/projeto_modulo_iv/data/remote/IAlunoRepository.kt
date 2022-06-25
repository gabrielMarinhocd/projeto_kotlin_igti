package br.com.igti.projeto_modulo_iv.data.remote

interface IAlunoRepository {

    fun listarAlunos()
    fun listarAlunoPorId()
    fun cadastrarAluno()
    fun alterarAluno()
    fun excluirAluno()
}