//package com.example.mscatalogo.util;
//
//import com.example.mscatalogo.entity.Categoria;
//import com.example.mscatalogo.repository.CategoriaRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//
//@Component
//public class CategoriaSeeder implements CommandLineRunner {
//
//    private final CategoriaRepository  categoriaRepository;
//
//    public CategoriaSeeder(CategoriaRepository categoriaRepository) {
//        this.categoriaRepository = categoriaRepository;
//    }
//
//    @Override
//    public void run(String... args) {
//        // Verificamos si ya existen datos para no duplicar
//        if (categoriaRepository.count() == 0) {
//            Categoria cat1 = new Categoria();
//            cat1.setNombre("Electrónica");
//            cat1.setProductos(new ArrayList<>()); // Inicializamos la lista de productos
//
//            Categoria cat2 = new Categoria();
//            cat2.setNombre("Ropa");
//            cat2.setProductos(new ArrayList<>());
//
//            Categoria cat3 = new Categoria();
//            cat3.setNombre("Hogar");
//            cat3.setProductos(new ArrayList<>());
//
//            Categoria cat4 = new Categoria();
//            cat4.setNombre("Juguetes");
//            cat4.setProductos(new ArrayList<>());
//
//            Categoria cat5 = new Categoria();
//            cat5.setNombre("Libros");
//            cat5.setProductos(new ArrayList<>());
//
//            categoriaRepository.save(cat1);
//            categoriaRepository.save(cat2);
//            categoriaRepository.save(cat3);
//            categoriaRepository.save(cat4);
//            categoriaRepository.save(cat5);
//
//            System.out.println("Datos de categorías insertados correctamente.");
//        } else {
//            System.out.println("Las categorías ya existen, no se insertaron datos.");
//        }
//    }
//}
