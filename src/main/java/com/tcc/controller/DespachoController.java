package com.tcc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.dto.DespachoDtoOut;
import com.tcc.service.IDespachoService;

@RestController
public class DespachoController {


    @Autowired
    private IDespachoService despachoService; 


    @GetMapping("/despacho/{documentoRemitente}/{numeroEnvio}")
    public List<DespachoDtoOut> getEstados(@PathVariable Integer documentoRemitente, @PathVariable String numeroEnvio) 
    {
        return despachoService.getDespachos(documentoRemitente, numeroEnvio);
    }

}
