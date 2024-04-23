package com.tcc.dto;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = EnvioDtoIn.Builder.class)
public class EnvioDtoIn {
    private String numeroEnvio;
    private Date fecha;
    private float peso;
    private String tipoEnvio;
    private String tipoEntrega;
    private Integer valorCobrado;
    private Integer valorACobrar; 
    private String observaciones; 
    private Integer idMercancia;

private EnvioDtoIn(String numeroEnvio,
                    Date fecha,
                    float peso,
                    String tipoEnvio,
                    String tipoEntrega,
                    Integer valorCobrado,
                    Integer valorACobrar,
                    String observaciones,
                    Integer idMercancia) {
        super();
    this.numeroEnvio = numeroEnvio;
    this.fecha = fecha;
    this.peso = peso;
    this.tipoEnvio = tipoEnvio;
    this.tipoEntrega = tipoEntrega;
    this.valorCobrado = valorCobrado;
    this.valorACobrar = valorACobrar;
    this.observaciones = observaciones;
    this.idMercancia = idMercancia;
}



public String getNumeroEnvio() {
    return numeroEnvio;
}
public Date getFecha() {
    return fecha;
}
public float getPeso() {
    return peso;
}
public String getTipoEnvio() {
    return tipoEnvio;
}
public String getTipoEntrega() {
    return tipoEntrega;
}
public Integer getValorCobrado() {
    return valorCobrado;
}
public Integer getValorACobrar() {
    return valorACobrar;
}
public String getObservaciones() {
    return observaciones;
}
public Integer getIdMercancia() {
    return idMercancia;
}


@JsonPOJOBuilder
public static class Builder {

    private String numeroEnvio;
    private Date fecha;
    private float peso;
    private String tipoEnvio;
    private String tipoEntrega;
    private Integer valorCobrado;
    private Integer valorACobrar; 
    private String observaciones; 
    private Integer idMercancia;

    public Builder withNumeroEnvio(String newNumeroEnvio) {
        this.numeroEnvio = newNumeroEnvio;
        return this;
    }
    public Builder withFecha(Date newFecha) {
        this.fecha = newFecha;
        return this;
    }
    public Builder withPeso(float newPeso) {
        this.peso = newPeso;
        return this;
    }
    public Builder withTipoEnvio(String newTipoEnvio) {
        this.tipoEnvio = newTipoEnvio;
        return this;
    }
    public Builder withTipoEntrega(String newTipoEntrega) {
        this.tipoEntrega = newTipoEntrega;
        return this;
    }
    public Builder withValorCobrado(Integer newValorCobrado) {
        this.valorCobrado = newValorCobrado;
        return this;
    }
    public Builder withValorACobrar(Integer newValorACobrar) {
        this.valorACobrar = newValorACobrar;
        return this;
    }
    public Builder withObservaciones(String newObservaciones) {
        this.observaciones = newObservaciones;
        return this;
    }  
    public Builder withIdMercancia(Integer newIdMercancia) {
        this.idMercancia = newIdMercancia;
        return this;
    }

    public EnvioDtoIn build() {
        return new EnvioDtoIn(this.numeroEnvio,
                            this.fecha,
                            this.peso,
                            this.tipoEnvio,
                            this.tipoEntrega,
                            this.valorCobrado,
                            this.valorACobrar,
                            this.observaciones,
                            this.idMercancia);
    }


}


}
