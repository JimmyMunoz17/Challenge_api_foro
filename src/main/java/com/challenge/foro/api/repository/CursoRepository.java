package com.challenge.foro.api.repository;

import com.challenge.foro.api.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
