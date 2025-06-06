package com.example.mscatalogoservice.controller;


import com.example.mscatalogoservice.entity.Categoria;
import com.example.mscatalogoservice.entity.Producto;
import com.example.mscatalogoservice.service.CategoriaService;
import com.example.mscatalogoservice.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    // Obtener todas las producto
    @GetMapping
    //public List<Producto> listar() {return productoService.listar();}
    public ResponseEntity<List<Producto>> list() {
        return ResponseEntity.ok().body(productoService.listar());
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

    // Eliminar una Producto por ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        productoService.eliminarPorId(id);  // Usar eliminarPorId en lugar de eliminar
    }

    ////
    // Filtrar productos por estado
    @GetMapping("/filtrar/estado")
    public ResponseEntity<List<Producto>> filtrarPorEstado(@RequestParam Boolean estado) {
        List<Producto> productos = productoService.findByEstado(estado);
        return ResponseEntity.ok(productos); // Devuelve un código 200 OK con la lista de productos
    }

    // Filtrar productos por código
    @GetMapping("/filtrar/codigo")
    public ResponseEntity<List<Producto>> filtrarPorCodigo(@RequestParam String codigo) {
        List<Producto> productos = productoService.findByCodigo(codigo);
        return ResponseEntity.ok(productos); // Devuelve un código 200 OK con la lista de productos
    }

    // Filtrar productos por nombre
    @GetMapping("/filtrar/nombre")
    public ResponseEntity<List<Producto>> filtrarPorNombre(@RequestParam String nombre) {
        List<Producto> productos = productoService.findByNombreContaining(nombre);
        return ResponseEntity.ok(productos); // Devuelve un código 200 OK con la lista de productos
    }

    @GetMapping("/filtrar/fecha")
    public ResponseEntity<List<Producto>> filtrarPorFechaCreacion(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaInicio,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaFin
    ) {
        List<Producto> productos = productoService.findByFechaCreacionBetween(fechaInicio, fechaFin);
        return ResponseEntity.ok(productos);
    }

}
