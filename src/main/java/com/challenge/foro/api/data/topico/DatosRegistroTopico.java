package com.challenge.foro.api.data.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje ,
        @NotNull
        Long autorId,
        @NotNull
        Long cursoId) {
}
