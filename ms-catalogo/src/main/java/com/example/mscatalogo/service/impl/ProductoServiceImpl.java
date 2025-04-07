package com.example.mscatalogo.service.impl;

import com.example.mscatalogo.entity.Producto;
import com.example.mscatalogo.repository.ProductoRepository;
import com.example.mscatalogo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listar() {

        return productoRepository.findAll();
    }

    @Override
    public Producto guardar(Producto producto) {

        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizar(Producto producto) {

        return productoRepository.save(producto);
    }

    @Override
    public Optional<Producto> listarPorId(Integer id) {
        return productoRepository.findById(id);

    }

    @Override
    public void eliminarPorId(Integer id) {
        productoRepository.deleteById(id);
    }

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> findByEstado(Boolean estado) {
        return productoRepository.findByEstado(estado);
    }

    @Override
    public List<Producto> findByCodigo(String codigo) {
        return productoRepository.findByCodigo(codigo);
    }

    @Override
    public List<Producto> findByNombreContaining(String nombre) {
        return productoRepository.findByNombreContaining(nombre);
    }

    @Override
    public List<Producto> findByFechaCreacionBetween(Date fechaCreacionAfter, Date fechaCreacionBefore) {
        return productoRepository.findByFechaCreacionBetween(fechaCreacionAfter, fechaCreacionBefore);
    }

    // Métodos de filtrado
//    public List<Producto> filtrarPorEstado(Boolean estado) {
//        return productoRepository.findByEstado((estado);
//    }
//
//    public List<Producto> filtrarPorCodigo(String codigo) {
//        return productoRepository.findByCodigo((codigo);
//    }
//
//    public List<Producto> filtrarPorNombre(String nombre) {
//        return productoRepository.findByNombreContaining((nombre);
//    }
//
//    public List<Producto> filtrarPorFechaCreacion(Date fechaInicio, Date fechaFin) {
//        return productoRepository.findByFechaCreacionBetween((fechaInicio, fechaFin);
//    }
}
