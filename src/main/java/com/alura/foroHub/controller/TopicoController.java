package com.alura.foroHub.controller;


import com.alura.foroHub.domain.topico.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
    @Autowired
    private ITopicoRepsoitory topicoRepsoitory;

    @PostMapping
    public ResponseEntity<DatosRespuestaTopico> registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico, UriComponentsBuilder uriComponentsBuilder){

        Topico tp = topicoRepsoitory.save(new Topico(datosRegistroTopico));
        DatosRespuestaTopico datosRespuestaTopico = new DatosRespuestaTopico(tp.getId(), tp.getTitulo(), tp.getMensaje(), tp.getAutor(), tp.getCurso().toString());
        URI url = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(tp.getId()).toUri();

        return ResponseEntity.created(url).body(datosRespuestaTopico);
    }

    @GetMapping
    public ResponseEntity<Page<DatosListadoTopico>> listarTopicos(@PageableDefault(size = 5)Pageable paginacion){
        return ResponseEntity.ok(topicoRepsoitory.findAll(paginacion).map(DatosListadoTopico::new));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosListadoTopico> detallarTopico(@PathVariable Long id){
        Topico topico = topicoRepsoitory.getReferenceById(id);
        var datosTopico = new DatosListadoTopico(topico);

        return ResponseEntity.ok(datosTopico);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity actualizarTopico(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico, @PathVariable Long id){
        Topico topico = topicoRepsoitory.getReferenceById(id);
        var datosTopico = topico.actualizarDatos(datosActualizarTopico);

        return ResponseEntity.ok(datosTopico);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarTopico(@PathVariable Long id){
        Topico topico = topicoRepsoitory.getReferenceById(id);
        topicoRepsoitory.delete(topico);
    }

}
