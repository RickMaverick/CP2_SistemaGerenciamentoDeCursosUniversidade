package org.example.controller.dto;

import jakarta.persistence.*;
import lombok.Data;
import org.example.model.Professor;

import java.time.LocalDate;
import java.util.List;

@Data
public class CursoDTO {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private List<Professor> professoresDocentes;
}
