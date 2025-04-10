package com.example.mscatalogoservice.repository;


import com.example.mscatalogoservice.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    @Query("SELECT p FROM Producto p JOIN FETCH p.categoria WHERE p.id = :id")
    Optional<Producto> findByIdWithCategoria(@Param("id") Integer id);

    List<Producto> findByEstado(Boolean estado);

    List<Producto> findByCodigo(String codigo);

    List<Producto> findByFechaCreacionBetween(Date fechaCreacionAfter, Date fechaCreacionBefore);

    List<Producto> findByNombreContaining(String nombre);
}