package com.tcc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.service.IEstadoService;


@RestController
public class EstadoController {

    @Autowired
    private IEstadoService estadoService; 

    @GetMapping("/estado/estados")
    public  Map<String, Object> getEstados() 
    {
        Map<String, Object> response = new HashMap<>();

        try
        {
            response.put("Estado", "200");
            response.put("Response", estadoService.getEstados());

        } catch(Exception ex) {
            response.put("Estado", "500");
            response.put("Response", ex.getMessage());
        }
        return response;
    }

    @GetMapping("/estado/nombreEstado/{idEstado}")
    public Map<String, Object> getEstados(@PathVariable Integer idEstado)
    {
        Map<String, Object> response = new HashMap<>();
        try
        {
            response.put("Estado", "200");
            response.put("Response",  estadoService.getNombreEstado(idEstado));

        } catch (Exception ex) {
            response.put("Estado", "500");
            response.put("Response", ex.getMessage());
        }

        return response;
    }

    

}
