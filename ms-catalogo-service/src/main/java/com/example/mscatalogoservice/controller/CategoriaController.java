package com.example.mscatalogoservice.controller;

import com.example.mscatalogoservice.entity.Categoria;
import com.example.mscatalogoservice.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

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
