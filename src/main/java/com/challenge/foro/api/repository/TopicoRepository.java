package com.challenge.foro.api.repository;

import com.challenge.foro.api.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
