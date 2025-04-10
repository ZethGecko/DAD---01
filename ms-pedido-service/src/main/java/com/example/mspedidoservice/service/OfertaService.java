package com.example.mspedidoservice.service;

import com.example.mspedidoservice.entity.Oferta;

import java.util.List;
import java.util.Optional;

public interface OfertaService {
    public List<Oferta> listar();
    public Oferta guardar(Oferta oferta);
    public Oferta actualizar(Oferta oferta);
    public Optional<Oferta> listar(Integer id);
    public void eliminar(Integer id);
}
