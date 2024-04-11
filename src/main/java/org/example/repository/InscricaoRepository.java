package org.example.repository;

import org.example.model.InscricaoAlunoCurso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscricaoRepository extends JpaRepository<InscricaoAlunoCurso, Long> {
}
