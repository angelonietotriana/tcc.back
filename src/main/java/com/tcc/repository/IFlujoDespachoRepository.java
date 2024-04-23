package com.tcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcc.models.FlujoDespacho;

@Repository
public interface IFlujoDespachoRepository extends JpaRepository<FlujoDespacho, Integer> {

}
