package com.tcc.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tcc.dto.EstadoDtoOut;
import com.tcc.service.IEstadoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class EstadoController {

    @Autowired
    private IEstadoService estadoService; 

    @GetMapping("/estados")
    public List<EstadoDtoOut> getEstados() 
    {
        List<EstadoDtoOut> estados = estadoService.getEstados();
        return estados;
    }

    @GetMapping("/nombreEstado/{idEstado}")
    public String getEstados(@PathVariable Integer idEstado) 
    {
        return estadoService.getNombreEstado(idEstado);
    }

    

}
