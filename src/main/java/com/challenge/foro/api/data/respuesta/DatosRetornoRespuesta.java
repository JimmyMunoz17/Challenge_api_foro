package com.challenge.foro.api.data.respuesta;


import com.challenge.foro.api.modelo.Respuesta;

public record DatosRetornoRespuesta(String mensaje, String topico, String autor) {

    public DatosRetornoRespuesta(Respuesta respuesta) {
        this(respuesta.getMensaje(), respuesta.getTopico().getTitulo(), respuesta.getAutor().getNombre());
    }
}
