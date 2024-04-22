package com.tcc.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import jakarta.persistence.Table;

@Entity
@Table(name = "DESPACHO")
@NamedStoredProcedureQuery(name = "despacho.getDespachos",
                           procedureName = "TCC.PCK_CRUD_TCC.getDespachos",
                           resultClasses = Despacho.class,
                           parameters = {
                            @StoredProcedureParameter(mode= ParameterMode.IN, name="P_DOCUMENTO", type=void.class),
                            @StoredProcedureParameter(mode= ParameterMode.IN, name="P_NUMERO_ENVIO", type=void.class),
                            @StoredProcedureParameter(mode= ParameterMode.REF_CURSOR, name="P_DESPACHOS", type=void.class)
                           })                        
public class Despacho {

    @Id
    @Column(name = "ID_DESPACHO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdDespacho;

    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;

    @Column(name = "CIUDAD_ORIGEN")
    private Integer ciudadOrigen;

    @Column(name = "CIUDAD_DESTINO")
    private Integer ciudadDestino;

    @Column(name = "DIRECCION_REMITENTE")
    private String direccionRemitente;
    
    @Column(name = "DIRECCION_DESTINATARIO")
    private String direccionDestinatario;

    @Column(name = "DOCUMENTO_REMITENTE")
    private String documentoRemitente; 
    
    @Column(name = "DOCUMENTO_DESTINATARIO")
    private String documentoDestinatario; 
    
    @Column(name = "NOMBRE_REMITENTE")
    private String nombreRemitente;
    
    @Column(name = "NOMBRE_DESTINATARIO")
    private String nombreDestinatario;  

    @Column(name = "CEL_REMITENTE")
    private String celRemitente;
     
    @Column(name = "CEL_DESTINATARIO")
    private String celDestinatario;  
    
    @Column(name = "ID_MERCANCIA")
    private Integer idMercancia;
    
    @Column(name = "NUMERO_ENVIO")
    private String numeroEnvio;   
    
    @Column(name = "ID_ESTADO")
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

   public Despacho() {
      super();
   }

public Despacho(Integer IdDespacho,
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
