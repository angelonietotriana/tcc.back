package com.tcc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.tcc.dto.DespachoDtoIn;
import com.tcc.dto.DespachoDtoOut;
import com.tcc.dto.EstadoDtoIn;
import com.tcc.service.IDespachoService;



@RestController
public class DespachoController {


    @Autowired
    private IDespachoService despachoService; 


    @GetMapping("/despacho/{documentoRemitente}/{numeroEnvio}")
    public  Map<String, Object> getEstados(@PathVariable Integer documentoRemitente, @PathVariable String numeroEnvio)
    {
        Map<String, Object> response = new HashMap<>();
        List<DespachoDtoOut> listResponse;
        try
        {
            listResponse = despachoService.getDespachos(documentoRemitente, numeroEnvio);
            response.put("Estado", "200");
            response.put("Response", listResponse);

        } catch(Exception ex) {
            response.put("Estado", "500");
            response.put("Response", ex.getMessage());
        }

        return response;
    }

    @PostMapping("/despacho/crea")
    public Map<String, Object> postCreaDespacho(@RequestBody String entity) throws JsonMappingException, JsonProcessingException {
        Map<String, Object> response = new HashMap<>();
        try
        {
            ObjectMapper mapper = new ObjectMapper();
            DespachoDtoIn despacho = mapper.readValue(entity, DespachoDtoIn.class);
            String numeroEnvio = despachoService.guardarDespacho(despacho);

            response.put("Estado", "200");
            response.put("Número envío", numeroEnvio);
        } catch(JsonParseException | InvalidFormatException ex){
            response.put("Estado", "402");
            response.put("Response","Formato incorrecto de entrada"); 
        } catch(Exception ex) {
            response.put("Estado", "500");
            response.put("Response", ex.getMessage());
        }

        return response;
    }


    @PutMapping("despacho/cambiaEstado")
    public Map<String, Object> putMethodName(@RequestBody String nuevoEstado) throws Exception {
        Map<String, Object> response = new HashMap<>();
        try
        {
            ObjectMapper mapper = new ObjectMapper();
            EstadoDtoIn estadoDtoIn = mapper.readValue(nuevoEstado, EstadoDtoIn.class);
            DespachoDtoOut entity = despachoService.actualizaEstadoDespacho(estadoDtoIn);
            response.put("Estado", "200");
            response.put("Response", entity);
        } catch(JsonParseException | InvalidFormatException ex){
            response.put("Estado", "402");
            response.put("Response","Formato incorrecto de entrada");
        } catch(Exception ex) {
            response.put("Estado", "500");
            response.put("Response", ex.getMessage());
        }


        return response;
    }
    

}
