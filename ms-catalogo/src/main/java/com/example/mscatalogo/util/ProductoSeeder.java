package com.example.mscatalogo.util;

import com.example.mscatalogo.entity.Categoria;
import com.example.mscatalogo.entity.Producto;
import com.example.mscatalogo.repository.CategoriaRepository;
import com.example.mscatalogo.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

@Component
public class ProductoSeeder implements CommandLineRunner {

    private final ProductoRepository productoRepository;
    private final CategoriaRepository categoriaRepository;

    public ProductoSeeder(ProductoRepository productoRepository, CategoriaRepository categoriaRepository) { this.productoRepository = productoRepository;
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public void run(String... args) {
        // Inserción de categorías
        Categoria cat1 = new Categoria();
        cat1.setNombre("Electrónica");

        Categoria cat2 = new Categoria();
        cat2.setNombre("Ropa");

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2));

        // Inserción de productos asociados
        Producto prod1 = new Producto();
        prod1.setNombre("Smartphone");
        prod1.setCodigo("ELEC001");
        prod1.setDescripcion("Teléfono inteligente");
        prod1.setFechaCreacion(new Date());
        prod1.setCategoria(cat1);
        prod1.setActivo(true);

        Producto prod2 = new Producto();
        prod2.setNombre("Televisor");
        prod2.setCodigo("ELEC002");
        prod2.setDescripcion("Televisor HD");
        prod2.setFechaCreacion(new Date());
        prod2.setCategoria(cat1);
        prod2.setActivo(true);

        Producto prod3 = new Producto();
        prod3.setNombre("Camiseta");
        prod3.setCodigo("ROP001");
        prod3.setDescripcion("Camiseta de algodón");
        prod3.setFechaCreacion(new Date());
        prod3.setCategoria(cat2);
        prod3.setActivo(true);

        productoRepository.saveAll(Arrays.asList(prod1, prod2, prod3));

        System.out.println("Datos insertados correctamente en categorías y productos.");
    }
}

