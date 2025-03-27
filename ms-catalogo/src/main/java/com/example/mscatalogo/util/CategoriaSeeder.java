package com.example.mscatalogo.util;

import com.example.mscatalogo.entity.Categoria;
import com.example.mscatalogo.repository.CategoriaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CategoriaSeeder implements CommandLineRunner {

    private final CategoriaRepository  categoriaRepository;

    public CategoriaSeeder(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public void run(String... args) {
        // Verificamos si ya existen datos para no duplicar
        if (categoriaRepository.count() == 0) {
            Categoria cat1 = new Categoria(null, "Electrónica");
            Categoria cat2 = new Categoria(null, "Ropa");
            Categoria cat3 = new Categoria(null, "Hogar");
            Categoria cat4 = new Categoria(null, "Juguetes");
            Categoria cat5 = new Categoria(null, "Libros");

            categoriaRepository.save(cat1);
            categoriaRepository.save(cat2);
            categoriaRepository.save(cat3);
            categoriaRepository.save(cat4);
            categoriaRepository.save(cat5);

            System.out.println("Datos de categorías insertados correctamente.");
        } else {
            System.out.println("Las categorías ya existen, no se insertaron datos.");
        }
    }
}
