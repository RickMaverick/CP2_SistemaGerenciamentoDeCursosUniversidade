package org.example.controller;

import org.example.controller.dto.CursoDTO;
import org.example.model.Curso;
import org.example.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    private CursoService cursoService;
    @Autowired
    public CursoController(CursoService cursoService){this.cursoService = cursoService;}

    @PostMapping
    public ResponseEntity<Curso> postCurso(@RequestBody CursoDTO cursoDTO){
        Curso novoCurso = new Curso(cursoDTO);
        return ResponseEntity.ok(cursoService.cadastrarCurso(novoCurso));
    }

    @GetMapping
    public  ResponseEntity<List<Curso>> getAllCursos(){
        return ResponseEntity.ok(cursoService.listarTodosCursos());
    }
}
