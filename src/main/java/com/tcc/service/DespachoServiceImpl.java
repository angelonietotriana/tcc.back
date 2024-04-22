package com.tcc.service;


import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcc.dto.DespachoDtoOut;
import com.tcc.models.Despacho;
import com.tcc.repository.IDespachoRepository;

import jakarta.transaction.Transactional;

@Service
public class DespachoServiceImpl implements IDespachoService {

    private IDespachoRepository despachoRepository;

    @Autowired
    public void setDespachoRepository(IDespachoRepository despachoRepository) {
        this.despachoRepository = despachoRepository;
    }

    @Override
    @Transactional
    public List<DespachoDtoOut> getDespachos(Integer documento, String numeroEnvio) {
        List<Despacho> tmp = despachoRepository.getDespachos(documento, numeroEnvio);
    
        return  tmp.stream()
                   .map(entidadOrigen -> { return new DespachoDtoOut(entidadOrigen.getIdDespacho(), 
                                                                     entidadOrigen.getFechaCreacion(),
                                                                     entidadOrigen.getCiudadOrigen(),
                                                                     entidadOrigen.getCiudadDestino(),
                                                                     entidadOrigen.getDireccionRemitente(),
                                                                     entidadOrigen.getDireccionDestinatario(),
                                                                     entidadOrigen.getDocumentoRemitente(),
                                                                     entidadOrigen.getDocumentoDestinatario(),
                                                                     entidadOrigen.getNombreRemitente(),
                                                                     entidadOrigen.getNombreDestinatario(),
                                                                     entidadOrigen.getCelRemitente(),
                                                                     entidadOrigen.getCelDestinatario(),
                                                                     entidadOrigen.getIdMercancia(),
                                                                     entidadOrigen.getNumeroEnvio(),
                                                                     entidadOrigen.getIdEstado()); 
                                                                    })
                   .collect(Collectors.toList());
    }

    

}
