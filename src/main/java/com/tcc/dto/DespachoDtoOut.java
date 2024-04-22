package com.tcc.dto;

import java.util.Date;

public class DespachoDtoOut {

    private Integer IdDespacho;
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
    
    
    public Integer getIdDespacho() {
        return IdDespacho;
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




public DespachoDtoOut( Integer IdDespacho,
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
                        Integer idEstado) {
    super();
    this.IdDespacho = IdDespacho;
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
    
 }
}
