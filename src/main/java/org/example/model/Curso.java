package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.controller.dto.CursoDTO;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "cursos_professores",
            joinColumns = @JoinColumn(name = "curso_fk"),
            inverseJoinColumns = @JoinColumn(name = "professor_fk"))
    private List<Professor> professoresDocentes;

    //Construtor DTO
    public Curso(CursoDTO cursoDTO){
        this.nome = cursoDTO.getNome();
        this.descricao = cursoDTO.getDescricao();
        this.dataInicio = cursoDTO.getDataInicio();
        this.professoresDocentes = cursoDTO.getProfessoresDocentes();
    }
}
