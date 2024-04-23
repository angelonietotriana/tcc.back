package com.tcc.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = DespachoDtoIn.Builder.class)
public class DespachoDtoIn {
    private Integer idDespacho;
    private Date fechaCreacion;
    private Integer ciudadOrigen;
    private Integer ciudadDestino;
    private String direccionRemitente;
    private String direccionDestinatario;
    private String documentoRemitente;
    private String documentoDestinatario;
    private String nombreRemitente;
    private String nombreDestinatario;
    private String celRemitente;
    private String celDestinatario;
    private Integer idMercancia;
    private String numeroEnvio;
    private Integer idEstado;
    // valores del envio
    private float peso;
    private String tipoEntrega;
    private String tipoEnvio;
    private Integer valorCobrado;
    private Integer valorACobrar;
    private String observaciones;

private DespachoDtoIn(Integer idDespacho,
                        Date fechaCreacion,
                        Integer ciudadOrigen,
                        Integer ciudadDestino,
                        String direccionRemitente,
                        String direccionDestinatario,
                        String documentoRemitente,
                        String documentoDestinatario,
                        String nombreRemitente,
                        String nombreDestinatario,
                        String celRemitente,
                        String celDestinatario,
                        Integer idMercancia,
                        String numeroEnvio,
                        Integer idEstado,
                        float peso,
                        String tipoEnvio,
                        String tipoEntrega,
                        Integer valorCobrado,
                        Integer valorACobrar,
                        String observaciones) {
    super();
    this.idDespacho = idDespacho;
    this.fechaCreacion = fechaCreacion;
    this.ciudadOrigen = ciudadOrigen;
    this.ciudadDestino = ciudadDestino;
    this.direccionRemitente = direccionRemitente;
    this.direccionDestinatario = direccionDestinatario;
    this.documentoRemitente = documentoRemitente;
    this.documentoDestinatario = documentoDestinatario;
    this.nombreRemitente = nombreRemitente;
    this.nombreDestinatario = nombreDestinatario;
    this.celRemitente = celRemitente;
    this.celDestinatario = celDestinatario;
    this.idMercancia = idMercancia;
    this.numeroEnvio = numeroEnvio;
    this.idEstado = idEstado;

    this.peso = peso;
    this.tipoEnvio = tipoEnvio;
    this.tipoEntrega = tipoEntrega;
    this.valorCobrado = valorCobrado;
    this.valorACobrar = valorACobrar;
    this.observaciones = observaciones;
}

public Integer getIdDespacho() {
    return idDespacho;
}
public Date getFechaCreacion() {
    return fechaCreacion;
}
public Integer getCiudadOrigen() {
    return ciudadOrigen;
}
public Integer getCiudadDestino() {
    return ciudadDestino;
}
public String getDireccionRemitente() {
    return direccionRemitente;
}
public String getDireccionDestinatario() {
    return direccionDestinatario;
}
public String getDocumentoRemitente() {
    return documentoRemitente;
}
public String getDocumentoDestinatario() {
    return documentoDestinatario;
}
public String getNombreRemitente() {
    return nombreRemitente;
}
public String getNombreDestinatario() {
    return nombreDestinatario;
}
public String getCelRemitente() {
    return celRemitente;
}
public String getCelDestinatario() {
    return celDestinatario;
}
public Integer getIdMercancia() {
    return idMercancia;
}
public String getNumeroEnvio() {
    return numeroEnvio;
}
public Integer getIdEstado() {
    return idEstado;
}
public String getTipoEntrega() {
    return tipoEntrega;
}
public String getTipoEnvio() {
    return tipoEnvio;
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
public float getPeso() {
    return peso;
}

@JsonPOJOBuilder
public static class Builder {

    @JsonProperty("id_despacho")
    private Integer idDespacho;
    @JsonProperty("fecha_creacion")
    private Date fechaCreacion;
    @JsonProperty("ciudad_origen")
    private Integer ciudadOrigen;
    @JsonProperty("ciudad_destino")
    private Integer ciudadDestino;
    @JsonProperty("direccion_remitente")
    private String direccionRemitente;
    @JsonProperty("direccion_destinatario")
    private String direccionDestinatario;
    @JsonProperty("documento_remitente")
    private String documentoRemitente;
    @JsonProperty("documento_destinatario")
    private String documentoDestinatario;
    @JsonProperty("nombre_remitente")
    private String nombreRemitente;
    @JsonProperty("nombre_destinatario")
    private String nombreDestinatario;
    @JsonProperty("celular_remitente")
    private String celRemitente;
    @JsonProperty("celular_destinatario")
    private String celDestinatario;
    @JsonProperty("id_mercancia")
    private Integer idMercancia;
    @JsonProperty("numero_envio")
    private String numeroEnvio;
    @JsonProperty("id_estado")
    private Integer idEstado;
    // valores del envio
    @JsonProperty("peso_envio")
    private float peso;
    @JsonProperty("tipo_entrega")
    private String tipoEntrega;
    @JsonProperty("tipo_envio")
    private String tipoEnvio;
    @JsonProperty("valor_cobrado")
    private Integer valorCobrado;
    @JsonProperty("valor_a_cobrar")
    private Integer valorACobrar;
    @JsonProperty("observaciones")
    private String observaciones;

    public Builder withIdDespacho(Integer newIdDespacho) {
        this.idDespacho = newIdDespacho;
        return this;
    }
    public Builder withFechaCreacion(Date newFechaCreacion) {
        this.fechaCreacion = newFechaCreacion;
        return this;
    }
    public Builder withCiudadOrigen(Integer newCiudadOrigen) {
        this.ciudadOrigen = newCiudadOrigen;
        return this;
    }
    public Builder withCiudadDestino(Integer newCiudadDestino) {
        this.ciudadDestino = newCiudadDestino;
        return this;
    }
    public Builder withDireccionRemitente(String newDireccionRemitente) {
        this.direccionRemitente = newDireccionRemitente;
        return this;
    }
    public Builder withDireccionDestinatario(String newDireccionDestinatario) {
        this.direccionDestinatario = newDireccionDestinatario;
        return this;
    }
    public Builder withDocumentonRemitente(String newDocumentoRemitente) {
        this.documentoRemitente = newDocumentoRemitente;
        return this;
    }
    public Builder withDocumentoDestinatario(String newDocumentoDestinatario) {
        this.documentoDestinatario = newDocumentoDestinatario;
        return this;
    }
    public Builder withNombreRemitente(String newNombreRemitente) {
        this.nombreRemitente = newNombreRemitente;
        return this;
    }
    public Builder withNombreDestinatario(String newNombreDestinatario) {
        this.nombreDestinatario = newNombreDestinatario;
        return this;
    }
    public Builder withCelularRemitente(String newCelRemitente) {
        this.celRemitente = newCelRemitente;
        return this;
    }
    public Builder withCelularDestinatario(String newCelDestinatario) {
        this.celDestinatario = newCelDestinatario;
        return this;
    }
    public Builder withIdMercancia(Integer newIdMercancia) {
        this.idMercancia = newIdMercancia;
        return this;
    }
    public Builder withNumeroEnvio(String newNumeroEnvio) {
        this.numeroEnvio = newNumeroEnvio;
        return this;
    }
    public Builder withIdEstado(Integer newIdEstado) {
        this.idEstado = newIdEstado;
        return this;
    }
    public Builder withPeso(float newPeso) {
        this.peso = newPeso;
        return this;
    }
    public Builder withTipoEntrega(String newTipoEntrega) {
        this.tipoEntrega = newTipoEntrega;
        return this;
    }
    public Builder withTipoEnvio(String newTipoEnvio) {
        this.tipoEnvio = newTipoEnvio;
        return this;
    }
    public Builder withValorCobrado(Integer newValorCobrado) {
        this.valorCobrado = newValorCobrado;
        return this;
    }    
    public Builder withVAlorACobrar(Integer newValorACobrar) {
        this.valorACobrar = newValorACobrar;
        return this;
    }
    public Builder withObservaciones(String newObservaciones) {
        this.observaciones = newObservaciones;
        return this;
    }

    public DespachoDtoIn build() {
        return new DespachoDtoIn(this.idDespacho,
                                this.fechaCreacion,
                                this.ciudadOrigen,
                                this.ciudadDestino,
                                this.direccionRemitente,
                                this.direccionDestinatario,
                                this.documentoRemitente,
                                this.documentoDestinatario,
                                this.nombreRemitente,
                                this.nombreDestinatario,
                                this.celRemitente,
                                this.celDestinatario,
                                this.idMercancia,
                                this.numeroEnvio,
                                this.idEstado,
                                this.peso,
                                this.tipoEnvio,
                                this.tipoEntrega,
                                this.valorCobrado,
                                this.valorACobrar,
                                this.observaciones);
    }


}


}
