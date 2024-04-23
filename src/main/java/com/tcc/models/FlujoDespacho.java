package com.tcc.models;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FLUJO_DESPACHO")
public class FlujoDespacho implements Serializable {

   @Id
   @Column(name = "ID_FLUJO")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer idFlujo;

   @Column(name = "ESTADO_INICIAL")
   private String estadoInicial;

   @Column(name = "ESTADO_ACTUAL")
   private String estadoActual;

   @Column(name = "FECHA_CAMBIO")
   private Date fechaCambio;

   @Column(name = "ID_DESPACHO")
   private Integer idDespacho;


   public Integer getIdFlujo() {
      return idFlujo;
   }
   public String getEstadoInicial() {
      return estadoInicial;
   }
   public String getEstadoActual() {
      return estadoActual;
   }
   public Date getFechaCambio() {
      return fechaCambio;
   }
   public Integer getIdDespacho() {
      return idDespacho;
   }
   public FlujoDespacho() {
      super();
   }


   public FlujoDespacho(String estadoInicial,
                        String estadoActual,
                        Date fechaCambio,
                        Integer idDespacho) {
      super();
      this.estadoInicial = estadoInicial;
      this.estadoActual = estadoActual;
      this.fechaCambio = fechaCambio;
      this.idDespacho = idDespacho;
   }

}
