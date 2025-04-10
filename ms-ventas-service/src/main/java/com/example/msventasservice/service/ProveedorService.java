package com.example.msventasservice.service;

import com.example.msventasservice.entity.Proveedor;

import java.util.List;
import java.util.Optional;

public interface ProveedorService {
    public List<Proveedor> listar();
    public Proveedor guardar(Proveedor proveedor);
    public Proveedor actualizar(Proveedor proveedor);
    public Optional<Proveedor> listarPorId(Integer id);
    public void eliminarPorId(Integer id);
}
