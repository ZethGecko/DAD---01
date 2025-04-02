package com.example.mscatalogo.repository;

import com.example.mscatalogo.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    Optional<Object> findByNombre(String nombre);
}
