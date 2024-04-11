package org.example.service;

import org.example.model.Curso;
import org.example.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    private CursoRepository cursoRepository;
    @Autowired
    public CursoService(CursoRepository cursoRepository){this.cursoRepository = cursoRepository;}

    public Curso cadastrarCurso(Curso novoCurso){
        return cursoRepository.save(novoCurso);
    }

    public List<Curso> listarTodosCursos(){return  cursoRepository.findAll();}
}
