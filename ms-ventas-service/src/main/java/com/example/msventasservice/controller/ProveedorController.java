package com.example.msventasservice.controller;

import com.example.msventasservice.entity.Proveedor;
import com.example.msventasservice.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {
    @Autowired
    private ProveedorService proveedorService;

    @GetMapping()
    public ResponseEntity<List<Proveedor>> list() {
        return ResponseEntity.ok().body(proveedorService.listar());
    }
    @PostMapping()
    public ResponseEntity<Proveedor> save(@RequestBody Proveedor proveedor){
        return ResponseEntity.ok(proveedorService.guardar(proveedor));
    }
    @PutMapping()
    public ResponseEntity<Proveedor> update(@RequestBody Proveedor proveedor){
        return ResponseEntity.ok(proveedorService.actualizar(proveedor));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Proveedor> listById(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(proveedorService.listarPorId(id).get());
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id){
        proveedorService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
