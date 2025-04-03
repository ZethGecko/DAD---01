package com.example.mscatalogo.service;

import com.example.mscatalogo.entity.Producto;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ProductoService {
    public List<Producto> listar();
    public Producto guardar(Producto producto);
    public Producto actualizar(Producto producto);
    public Optional<Producto> listarPorId(Integer id);
    public void eliminarPorId(Integer id);

    List<Producto> findByEstado(Boolean estado);
    List<Producto> findByCodigo(String codigo);
    List<Producto> findByNombreContaining(String nombre); // Filtrar por coincidencias parciales

    @Query("SELECT p FROM Producto p WHERE p.fechaCreacion BETWEEN :fechaInicio AND :fechaFin")
    List<Producto> findByFechaCreacionBetween(Date fechaInicio, Date fechaFin);
}
