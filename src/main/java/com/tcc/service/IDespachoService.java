package com.tcc.service;

import java.util.List;

import com.tcc.dto.DespachoDtoIn;
import com.tcc.dto.DespachoDtoOut;
import com.tcc.dto.EstadoDtoIn;


public interface IDespachoService {
    
    List<DespachoDtoOut> getDespachos(Integer documento, String numeroEnvio);
    String guardarDespacho(DespachoDtoIn despachoDtoIn) throws Exception;
    DespachoDtoOut actualizaEstadoDespacho(EstadoDtoIn despachoDtoIn)  throws Exception ;
}
