package br.com.igti.projeto_modulo_iv.data.remote.dto

import java.time.LocalDate
import java.time.LocalDateTime

class AlunoRequestDTO(
    private val nome : String,
    private val sobrenome: String,
    private val nascimento: LocalDate,
)