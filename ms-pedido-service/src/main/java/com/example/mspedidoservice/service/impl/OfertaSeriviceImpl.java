package com.example.mspedidoservice.service.impl;

import com.example.mspedidoservice.entity.Oferta;
import com.example.mspedidoservice.repository.OfertaRespository;
import com.example.mspedidoservice.service.OfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfertaSeriviceImpl implements OfertaService {
    @Autowired
    private OfertaRespository ofertaRespository;

    @Override
    public List<Oferta> listar() {
        return ofertaRespository.findAll();
    }

    @Override
    public Oferta guardar(Oferta oferta) {
        return ofertaRespository.save(oferta);
    }

    @Override
    public Oferta actualizar(Oferta oferta) {
        return ofertaRespository.save(oferta);
    }

    @Override
    public Optional<Oferta> listar(Integer id) {
        return ofertaRespository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        ofertaRespository.deleteById(id);
    }

}
