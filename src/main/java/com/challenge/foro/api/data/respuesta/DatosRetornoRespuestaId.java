package com.challenge.foro.api.data.respuesta;

import com.challenge.foro.api.data.topico.DatosRespuestaTopico;
import com.challenge.foro.api.data.topico.DatosRespuestaTopico;
import com.challenge.foro.api.data.usuario.DatosRespuestaUsuario;
import com.challenge.foro.api.modelo.Respuesta;

public record DatosRetornoRespuestaId(String mensaje, DatosRespuestaTopico topico, String fechaCreacion, DatosRespuestaUsuario autor, String solucion) {

    public DatosRetornoRespuestaId(Respuesta respuesta) {
        this(respuesta.getMensaje(), new DatosRespuestaTopico(respuesta.getTopico()), respuesta.getFechaCreacion().toString(),
                new DatosRespuestaUsuario(respuesta.getAutor()), respuesta.getSolucion().toString());
    }
}
