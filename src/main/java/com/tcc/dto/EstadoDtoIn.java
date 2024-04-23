package com.tcc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = EstadoDtoIn.Builder.class)
public class EstadoDtoIn {
    
private Integer idNuevoEstado;
private String numeroDocumentoRemitente;
private String numeroEnvio;

private EstadoDtoIn(Integer idEstado,
                    String numeroDocumentoRemitente,
                    String numeroEnvio) {
    super();
    this.idNuevoEstado = idEstado;
    this.numeroDocumentoRemitente = numeroDocumentoRemitente;
    this.numeroEnvio = numeroEnvio;
}

public Integer getIdNuevoEstado() {
    return idNuevoEstado;
}

public String getNumeroDocumentoRemitente() {
    return numeroDocumentoRemitente;
}

public String getNumeroEnvio() {
    return numeroEnvio;
}

@JsonPOJOBuilder
public static class Builder {

    @JsonProperty("id_nuevo_estado")
    private Integer idNuevoEstado;

    @JsonProperty("numero_documento_remitente")
    private String numeroDocumentoRemitente;

    @JsonProperty("numero_envio")
    private String numeroEnvio;

    public Builder withIdNuevoEstado(Integer newIdNuevoEstado) {
    this.idNuevoEstado = newIdNuevoEstado;
    return this;
    }
    public Builder withNumeroDocumentoRemitente(String newNumeroDocumentoRemitente) {
        this.numeroDocumentoRemitente = newNumeroDocumentoRemitente;
        return this;
    }
    public Builder withNumeroEnvio(String newNumeroEnvio) {
        this.numeroEnvio = newNumeroEnvio;
        return this;
    }

    public EstadoDtoIn build() {
        return new EstadoDtoIn(this.idNuevoEstado,
                                this.numeroDocumentoRemitente,
                                this.numeroEnvio);
    }


}


}
