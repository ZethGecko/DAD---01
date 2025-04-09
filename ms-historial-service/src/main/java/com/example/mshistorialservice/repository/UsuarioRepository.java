package com.example.mshistorialservice.repository;

import com.example.mshistorialservice.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Object> findByNombre(String nombre);
}
