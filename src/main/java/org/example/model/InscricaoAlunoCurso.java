package org.example.model;

import jakarta.persistence.*;
import lombok.Data;
import org.example.controller.dto.InscricaoAlunoCursoDTO;

import java.time.LocalDate;

@Entity
@Data
public class InscricaoAlunoCurso {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;
    private LocalDate dataInscricao;

    // Construtor DTO
    public InscricaoAlunoCurso(InscricaoAlunoCursoDTO inscricaoAlunoCursoDTO) {
        this.aluno = inscricaoAlunoCursoDTO.getAluno();
        this.curso = inscricaoAlunoCursoDTO.getCurso();
        this.dataInscricao = inscricaoAlunoCursoDTO.getDataInscricao();
    }
}
