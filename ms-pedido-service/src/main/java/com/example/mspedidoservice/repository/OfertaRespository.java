package com.example.mspedidoservice.repository;

import com.example.mspedidoservice.entity.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OfertaRespository extends JpaRepository<Oferta, Integer> {
    Optional<Object> findBytitulo(String titulo);
}
