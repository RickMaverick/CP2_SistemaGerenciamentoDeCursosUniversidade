package org.example.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String conclusaoGraduacao;
    private boolean fluenciaInglesPortugues;
    private String endereco;
    private LocalDate dataNascimento;
    private LocalDate dataInscricao;
    @ManyToMany
    private List<Curso> cursosInscrito;
}
