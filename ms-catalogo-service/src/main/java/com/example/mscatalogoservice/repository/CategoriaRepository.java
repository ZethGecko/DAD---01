package com.example.mscatalogoservice.repository;

import com.example.mscatalogoservice.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    //Optional<Object> findByNombre(String nombre);
}
