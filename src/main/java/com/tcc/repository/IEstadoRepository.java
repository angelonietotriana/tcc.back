package com.tcc.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.tcc.models.Estado;

@Repository
public interface IEstadoRepository extends JpaRepository<Estado, Integer> {

    @Procedure(name = "estado.getEstados")
    List<Estado> getEstados();


    @Procedure(procedureName = "TCC.PCK_CRUD_TCC.getEstado")
    String getNombreEstado(Integer idEstado);
   


}
