package com.example.mspedidoservice.controller;

import com.example.mspedidoservice.entity.Oferta;
import com.example.mspedidoservice.service.OfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ofertas")
public class OfertaController {
    @Autowired
    private OfertaService ofertaService;

    @GetMapping()
    public ResponseEntity<List<Oferta>> list() {
        return ResponseEntity.ok().body(ofertaService.listar());
    }

    @PostMapping()
    public ResponseEntity<Oferta> save(@RequestBody Oferta oferta){
        return ResponseEntity.ok(ofertaService.guardar(oferta));
    }
    @PutMapping()
    public ResponseEntity<Oferta> update(@RequestBody Oferta oferta){
        return ResponseEntity.ok(ofertaService.actualizar(oferta));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Oferta> listById(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(ofertaService.listar(id).get());
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id){
        ofertaService.eliminar(id);
        return "Eliminacion Correcta";
    }
}
