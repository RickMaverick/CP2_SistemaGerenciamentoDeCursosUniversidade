package org.example.service;

import org.example.controller.dto.InscricaoAlunoCursoDTO;
import org.example.model.InscricaoAlunoCurso;
import org.example.repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscricaoAlunoCursoService {
    private InscricaoRepository inscricaoRepository;
    @Autowired
    private InscricaoAlunoCursoService(InscricaoRepository inscricaoRepository){this.inscricaoRepository = inscricaoRepository;}

    public InscricaoAlunoCurso criarInscricao(InscricaoAlunoCursoDTO inscricaoAlunoCursoDTO){
        InscricaoAlunoCurso novaInscricao = new InscricaoAlunoCurso(inscricaoAlunoCursoDTO);
        return inscricaoRepository.save(novaInscricao);
    }
}
