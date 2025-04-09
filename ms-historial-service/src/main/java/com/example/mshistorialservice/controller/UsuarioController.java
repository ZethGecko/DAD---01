package com.example.mshistorialservice.controller;

import com.example.mshistorialservice.entity.Usuario;
import com.example.mshistorialservice.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping()
    public ResponseEntity<List<Usuario>> list() {
        return ResponseEntity.ok().body(usuarioService.listar());
    }
    @PostMapping()
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.guardar(usuario));
    }
    @PutMapping()
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.actualizar(usuario));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> listById(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(usuarioService.listarPorId(id).get());
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id){
        usuarioService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }

}
