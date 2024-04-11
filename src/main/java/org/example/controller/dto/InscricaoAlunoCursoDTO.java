package org.example.controller.dto;

import lombok.Data;
import org.example.model.Aluno;
import org.example.model.Curso;

import java.time.LocalDate;

@Data
public class InscricaoAlunoCursoDTO {
    private Aluno aluno;
    private Curso curso;
    private LocalDate dataInscricao;
}
