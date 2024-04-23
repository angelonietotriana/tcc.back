package com.tcc.service;


import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcc.constants.EstadosDespacho;
import com.tcc.dto.DespachoDtoIn;
import com.tcc.dto.DespachoDtoOut;
import com.tcc.dto.EstadoDtoIn;
import com.tcc.models.Despacho;
import com.tcc.models.Envio;
import com.tcc.models.FlujoDespacho;
import com.tcc.repository.IDespachoRepository;
import com.tcc.repository.IEnvioRepository;
import com.tcc.repository.IEstadoRepository;
import com.tcc.repository.IFlujoDespachoRepository;

import jakarta.transaction.Transactional;

@Service
public class DespachoServiceImpl implements IDespachoService {

    private IDespachoRepository despachoRepository;
    private IEnvioRepository envioRepository;
    private IFlujoDespachoRepository flujoDespachoRepository;
    private IEstadoRepository estadoRepository;

    @Autowired
    public void setEstadoRepository(IEstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    @Autowired
    public void setFlujoDespachoRepository(IFlujoDespachoRepository flujoDespachoRepository) {
        this.flujoDespachoRepository = flujoDespachoRepository;
    }

    @Autowired
    public void setEnvioRepository(IEnvioRepository envioRepository) {
        this.envioRepository = envioRepository;
    }

    @Autowired
    public void setDespachoRepository(IDespachoRepository despachoRepository) {
        this.despachoRepository = despachoRepository;
    }
    
    
    /*
     * Obtiene los despachos asociados al número de documento del remitente y número de envio.
     */
    @Override
    @Transactional(rollbackOn = Exception.class)
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

/*
 * Guarda un registro para las tablas Envio, Despacho y Flujo_Despacho
 */
@Override
@Transactional(rollbackOn = Exception.class)
public String guardarDespacho(DespachoDtoIn despachoDtoIn) throws Exception {
    String response;
    try {
        UUID uuid = UUID.randomUUID();
        String numerEnvio = uuid.toString();
        Envio envioToSave = new Envio(numerEnvio,
                                    new Date(),
                                    despachoDtoIn.getPeso(),
                                    despachoDtoIn.getTipoEnvio(),
                                    despachoDtoIn.getTipoEntrega(),
                                    despachoDtoIn.getValorCobrado(),
                                    despachoDtoIn.getValorACobrar(),
                                    despachoDtoIn.getObservaciones(),
                                    despachoDtoIn.getIdMercancia());
    
        envioRepository.saveAndFlush(envioToSave);
        
    
        Despacho entityToSave = new Despacho(despachoDtoIn);
        entityToSave.setNumeroEnvio(numerEnvio);
    
        despachoRepository.saveAndFlush(entityToSave);
    
        String estadoBase = EstadosDespacho.fromValue(despachoDtoIn.getIdEstado());
    
        FlujoDespacho flujoDespacho = new FlujoDespacho(estadoBase,
                                                        estadoBase,
                                                        new Date(),
                                                        entityToSave.getIdDespacho());
    
        flujoDespachoRepository.saveAndFlush(flujoDespacho);
        response = entityToSave.getNumeroEnvio();
    } catch(Exception ex) {
        throw new Exception("Falló al crear el despacho", ex);
    }

    return response;
}

/**
 * Actualiza el estado del despacho asociado al documento o número de envio
 * @throws Exception 
 */
@Override
@Transactional(rollbackOn = Exception.class)
public DespachoDtoOut actualizaEstadoDespacho(EstadoDtoIn despachoDtoIn) throws Exception {

    String nuevoEstado = estadoRepository.getNombreEstado(despachoDtoIn.getIdNuevoEstado());
    if (nuevoEstado == null || nuevoEstado.isEmpty()) {
        throw new Exception("No existe el Estado de transición");
    }

    List<Despacho> despacho = despachoRepository.getDespachos(Integer.parseInt(despachoDtoIn.getNumeroDocumentoRemitente()),
                                                            despachoDtoIn.getNumeroEnvio());

    Despacho actualizacionDespacho = despacho.stream().findFirst().get();
    String estadoActual = estadoRepository.getNombreEstado(actualizacionDespacho.getIdEstado());

    FlujoDespacho flujoDespacho = new FlujoDespacho(estadoActual,
                                                    nuevoEstado,
                                                    new Date(),
                                                    actualizacionDespacho.getIdDespacho());


    actualizacionDespacho.setIdEstado(despachoDtoIn.getIdNuevoEstado());

    
    despachoRepository.saveAndFlush(actualizacionDespacho);
    flujoDespachoRepository.saveAndFlush(flujoDespacho);

    return new DespachoDtoOut(actualizacionDespacho);
}
    

}
