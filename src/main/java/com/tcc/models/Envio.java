package com.tcc.models;

import java.util.Date;

import com.tcc.dto.EnvioDtoIn;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ENVIO")
public class Envio {

   @Id
   @Column(name = "NUMERO_ENVIO")
   private String numeroEnvio;

   @Column(name = "FECHA")
   private Date fecha;

   @Column(name = "PESO")
   private float peso;

   @Column(name = "TIPO_ENVIO")
   private String tipoEnvio;

   @Column(name = "TIPO_ENTREGA")
   private String tipoEntrega;

   @Column(name = "VALOR_COBRADO")
   private Integer valorCobrado;

   @Column(name = "VALOR_A_COBRAR")
   private Integer valorACobrar; 

   @Column(name = "OBSERVACIONES")
   private String observaciones; 

   @Column(name = "ID_MERCANCIA")
   private Integer idMercancia;


   public Envio() {
      super();
   }

   public Envio(String numeroEnvio,
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

   public Envio(EnvioDtoIn dtoToEntity) {

      super();
      this.numeroEnvio = dtoToEntity.getNumeroEnvio();
      this.fecha = dtoToEntity.getFecha();
      this.peso = dtoToEntity.getPeso();
      this.tipoEnvio = dtoToEntity.getTipoEnvio();
      this.tipoEntrega = dtoToEntity.getTipoEntrega();
      this.valorCobrado = dtoToEntity.getValorCobrado();
      this.valorACobrar = dtoToEntity.getValorACobrar();
      this.observaciones = dtoToEntity.getObservaciones();
      this.idMercancia = dtoToEntity.getIdMercancia();

   }



}
