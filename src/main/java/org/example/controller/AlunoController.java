package org.example.controller;

import org.example.controller.dto.AlunoDTO;
import org.example.model.Aluno;
import org.example.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {
    private AlunoService alunoService;
    @Autowired
    public AlunoController(AlunoService alunoService){this.alunoService = alunoService;}

    @PostMapping
    public ResponseEntity<Aluno> postAluno(@RequestBody AlunoDTO alunoDTO){
        Aluno novoAluno = new Aluno(alunoDTO);
        return ResponseEntity.ok(alunoService.cadastrarAluno(novoAluno));
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> getTodosAlunos(){
        return ResponseEntity.ok(alunoService.listarTodosAlunos());
    }
}
