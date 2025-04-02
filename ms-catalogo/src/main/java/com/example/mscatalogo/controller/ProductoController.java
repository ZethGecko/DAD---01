package com.example.mscatalogo.controller;

import com.example.mscatalogo.entity.Producto;
import com.example.mscatalogo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    // Obtener todas las producto
    @RequestMapping
    public List<Producto> listar() {
        return productoService.listar();
    }

    // Obtener una producto por ID
    @RequestMapping("/{id}")
    public Optional<Producto> buscar(@PathVariable Integer id) {
        return productoService.listarPorId(id);  // Usar listarPorId en lugar de buscar
    }

    // Crear una nueva producto
    @PostMapping
    public Producto guardar(@RequestBody Producto producto) {
        return productoService.guardar(producto);
    }

    // Actualizar una producto existente
    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable Integer id, @RequestBody Producto producto) {
        producto.setId(id);  // Asegúrate de que el ID esté actualizado
        return productoService.actualizar(producto);
    }

    // Eliminar una producto por ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        productoService.eliminarPorId(id);  // Usar eliminarPorId en lugar de eliminar
    }

    //
}
