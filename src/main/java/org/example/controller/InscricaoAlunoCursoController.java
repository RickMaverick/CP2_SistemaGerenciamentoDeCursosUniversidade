package org.example.controller;

import org.example.controller.dto.InscricaoAlunoCursoDTO;
import org.example.model.InscricaoAlunoCurso;
import org.example.service.InscricaoAlunoCursoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class InscricaoAlunoCursoController {
    private InscricaoAlunoCursoService inscricaoAlunoCursoService;
    public InscricaoAlunoCursoController(InscricaoAlunoCursoService inscricaoAlunoCursoService){this.inscricaoAlunoCursoService = inscricaoAlunoCursoService;}

    @PostMapping
    public ResponseEntity<InscricaoAlunoCurso> postInscricao(@RequestBody InscricaoAlunoCursoDTO novaInscricao){
        return ResponseEntity.ok(inscricaoAlunoCursoService.criarInscricao(novaInscricao));
    }
}
