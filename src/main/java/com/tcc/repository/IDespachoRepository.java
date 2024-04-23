package com.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tcc.models.Despacho;

@Repository
public interface IDespachoRepository extends JpaRepository<Despacho, Integer> {

    @Procedure(name = "despacho.getDespachos")
    List<Despacho> getDespachos(@Param("P_DOCUMENTO") Integer numeroDocumento,
                                @Param("P_NUMERO_ENVIO") String numeroEnvio);


}
