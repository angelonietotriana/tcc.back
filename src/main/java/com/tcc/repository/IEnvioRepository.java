package com.tcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcc.models.Envio;

@Repository
public interface IEnvioRepository extends JpaRepository<Envio, String> {

}
