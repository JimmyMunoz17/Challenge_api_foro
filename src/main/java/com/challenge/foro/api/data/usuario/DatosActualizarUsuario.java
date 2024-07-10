package com.challenge.foro.api.data.usuario;

import com.challenge.foro.api.modelo.Tipo;

public record DatosActualizarUsuario(Long id, String nombre, String email, String contrasena, Tipo tipo) {
}
