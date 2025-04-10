package com.example.msventasservice.repository;

import com.example.msventasservice.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
    Optional<Object> findByNombre(String nombre);

}
