package com.tcc.service;

import java.util.List;

import com.tcc.dto.DespachoDtoOut;


public interface IDespachoService {
    
    List<DespachoDtoOut> getDespachos(Integer documento, String numeroEnvio);
}
