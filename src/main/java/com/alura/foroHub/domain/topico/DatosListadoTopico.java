package com.alura.foroHub.domain.topico;

import java.time.LocalDateTime;

public record DatosListadoTopico(Long id,
                                 String titulo,
                                 String  mensaje,
                                 LocalDateTime fecha,
                                 Boolean status,
                                 String autor,
                                 String curso) {
    public DatosListadoTopico (Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha(), topico.getStatus(), topico.getAutor(), topico.getCurso().toString());
    }
}
