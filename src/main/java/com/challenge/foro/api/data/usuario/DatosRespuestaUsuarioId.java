package com.challenge.foro.api.data.usuario;


import com.challenge.foro.api.modelo.Usuario;

public record DatosRespuestaUsuarioId(String nombre, String email, String contrasena, String tipo) {

    public DatosRespuestaUsuarioId(Usuario usuario) {
        this(usuario.getNombre(), usuario.getEmail(), usuario.getContrasena(), usuario.getTipo().toString());
    }
}
