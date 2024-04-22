package com.tcc.service;

import java.util.List;

import com.tcc.dto.EstadoDtoOut;

public interface IEstadoService {
    
    List<EstadoDtoOut> getEstados();
    String getNombreEstado(Integer idEstado);
}
