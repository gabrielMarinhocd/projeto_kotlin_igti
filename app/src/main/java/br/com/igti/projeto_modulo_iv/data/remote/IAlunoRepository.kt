package br.com.igti.projeto_modulo_iv.data.remote

interface IAlunoRepository {

    fun getAlunos() : List<String>
}