package com.challenge.foro.api.data.topico;

import com.challenge.foro.api.modelo.Curso;
import com.challenge.foro.api.modelo.Estado;
import com.challenge.foro.api.modelo.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull
        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        Estado estado,
        @NotNull
        Long autorId,
        @NotNull
        Long cursoId) {
}
