package com.example.mscatalogo.repository;

import com.example.mscatalogo.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    Optional<Object> findByNombre(String nombre);

    List<Producto> findByEstado(Boolean estado);

    List<Producto> findByCodigo(String codigo);

    List<Producto> findByFechaCreacionBetween(Date fechaCreacionAfter, Date fechaCreacionBefore);

    List<Producto> findByNombreContaining(String nombre);
}
