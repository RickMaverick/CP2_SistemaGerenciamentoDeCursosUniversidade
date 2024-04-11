package org.example.service;

import org.example.model.Aluno;
import org.example.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private AlunoRepository alunoRepository;
    @Autowired
    public AlunoService(AlunoRepository alunoRepository){this.alunoRepository = alunoRepository;}

    public Aluno cadastrarAluno(Aluno novoAluno){
        return alunoRepository.save(novoAluno);
    }

    public List<Aluno> listarTodosAlunos(){
        return alunoRepository.findAll();
    }
}
