package com.example.mscatalogo.controller;


import com.example.mscatalogo.entity.Categoria;
import com.example.mscatalogo.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;
    @GetMapping()
    public ResponseEntity<List<Categoria>> list() {
        return ResponseEntity.ok().body(categoriaService.listar());
    }

    // Obtener todas las categorías
    @RequestMapping
    public List<Categoria> listar() {
        return categoriaService.listar();
    }

    // Obtener una categoría por ID
    @RequestMapping("/{id}")
    public Optional<Categoria> buscar(@PathVariable Integer id) {
        return categoriaService.listarPorId(id);  // Usar listarPorId en lugar de buscar
    }

    // Crear una nueva categoría
    @PostMapping
    public Categoria guardar(@RequestBody Categoria categoria) {
        return categoriaService.guardar(categoria);
    }

    // Actualizar una categoría existente
    @PutMapping("/{id}")
    public Categoria actualizar(@PathVariable Integer id, @RequestBody Categoria categoria) {
        categoria.setId(id);  // Asegúrate de que el ID esté actualizado
        return categoriaService.actualizar(categoria);
    }

    // Eliminar una categoría por ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        categoriaService.eliminarPorId(id);  // Usar eliminarPorId en lugar de eliminar
    }
}
