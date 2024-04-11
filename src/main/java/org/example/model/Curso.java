package org.example.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    @ManyToMany
    @JoinTable(name = "cursos_professores",
            joinColumns = @JoinColumn(name = "curso_fk"),
            inverseJoinColumns = @JoinColumn(name = "professor_fk"))
    private List<Professor> professoresDocentes;

}
