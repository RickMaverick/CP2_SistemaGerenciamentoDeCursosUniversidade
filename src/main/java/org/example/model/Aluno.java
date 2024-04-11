package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.controller.dto.AlunoDTO;
import org.hibernate.annotations.Cascade;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String conclusaoGraduacao;
    private String fluenciaInglesPortugues;
    private String endereco;
    private LocalDate dataNascimento;
    @OneToMany
    @JoinColumn(name = "aluno_id")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private List<InscricaoAlunoCurso> cursosInscrito;

    //Construtor DTO
    public Aluno (AlunoDTO alunoDTO){
        this.nome = alunoDTO.getNome();
        this.email = alunoDTO.getEmail();
        this.cpf = alunoDTO.getCpf();
        this.conclusaoGraduacao = alunoDTO.getCpf();
        this.fluenciaInglesPortugues = alunoDTO.getFluenciaInglesPortugues();
        this.endereco = alunoDTO.getEndereco();
        this.dataNascimento = alunoDTO.getDataNascimento();
        this.cursosInscrito = alunoDTO.getCursosInscrito();
    }

    // Construtor com a lista de cursos inscritos
    public Aluno(AlunoDTO alunoDTO, List<InscricaoAlunoCurso> cursosInscritos) {
        this.nome = alunoDTO.getNome();
        this.email = alunoDTO.getEmail();
        this.cpf = alunoDTO.getCpf();
        this.conclusaoGraduacao = alunoDTO.getConclusaoGraduacao();
        this.fluenciaInglesPortugues = alunoDTO.getFluenciaInglesPortugues();
        this.endereco = alunoDTO.getEndereco();
        this.dataNascimento = alunoDTO.getDataNascimento();
        this.cursosInscrito = cursosInscritos; // Atribuindo a lista de cursos
    }
}

