package org.example.controller.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CursoDTO {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
}
