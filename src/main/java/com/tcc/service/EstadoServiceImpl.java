package com.tcc.service;


import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcc.dto.EstadoDtoOut;
import com.tcc.models.Estado;
import com.tcc.repository.IEstadoRepository;

import jakarta.transaction.Transactional;

@Service
public class EstadoServiceImpl implements IEstadoService {

    private IEstadoRepository estadoRepository;

    @Autowired
    public void setEstadoRepository(IEstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }


    @Override
    @Transactional
    public List<EstadoDtoOut> getEstados() {
        List<Estado> tmp = estadoRepository.getEstados();
    
        return  tmp.stream()
                   .map(entidadOrigen -> { return new EstadoDtoOut(entidadOrigen.getIdEstado(), entidadOrigen.getNombre()); })
                   .collect(Collectors.toList());
    }


    @Override
    public String getNombreEstado(Integer idEstado) {
        return estadoRepository.getNombreEstado(idEstado);
    }
    

}
