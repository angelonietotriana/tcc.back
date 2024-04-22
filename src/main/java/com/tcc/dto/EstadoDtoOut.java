package com.tcc.dto;

public class EstadoDtoOut {

    private Integer idEstado;
    private String nombre;


    public Integer getIdEstado() {
        return idEstado;
    }
    public String getNombre() {
        return nombre;
    }

    public EstadoDtoOut(Integer idEstado, String nombre) {
        super();
        this.idEstado = idEstado;
        this.nombre = nombre;
    }
}
