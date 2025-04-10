package com.example.msventasservice.service.impl;

import com.example.msventasservice.entity.Proveedor;
import com.example.msventasservice.repository.ProveedorRepository;
import com.example.msventasservice.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorServiceImpl implements ProveedorService {
    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public List<Proveedor> listar() {
        return proveedorRepository.findAll();
    }

    @Override
    public Proveedor guardar(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public Proveedor actualizar(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public Optional<Proveedor> listarPorId(Integer id) {
        return proveedorRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        proveedorRepository.deleteById(id);
    }

}
