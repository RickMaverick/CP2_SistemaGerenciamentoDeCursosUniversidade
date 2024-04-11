package org.example.controller.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import org.example.model.Curso;

import java.time.LocalDate;
import java.util.List;

@Data
public class AlunoDTO {
    private String nome;
    private String email;
    private String cpf;
    private String conclusaoGraduacao;
    private String fluenciaInglesPortugues;
    private String endereco;
    private LocalDate dataNascimento;
    private LocalDate dataInscricao;
    @ManyToMany
    private List<Curso> cursosInscrito;
}
