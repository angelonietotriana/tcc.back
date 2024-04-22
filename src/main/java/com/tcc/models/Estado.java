package com.tcc.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;

@Entity
@NamedStoredProcedureQuery(name = "estado.getEstados",
                           procedureName = "TCC.PCK_CRUD_TCC.getEstados",
                           resultClasses = Estado.class,
                           parameters = {
                            @StoredProcedureParameter(mode= ParameterMode.REF_CURSOR, name="P_ESTADOS", type=void.class)
                           })                        
public class Estado {

    @Id
    @Column(name = "ID_ESTADO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstado;

    @Column(name = "NOMBRE")
    private String nombre;

    public Estado() {
        super();
    }
    public Integer getIdEstado() {
        return idEstado;
    }
    public String getNombre() {
        return nombre;
    }



    public Estado(Integer idEstado, String nombre) {
        super();
        this.idEstado = idEstado;
        this.nombre = nombre;
    }

}
