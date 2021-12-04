package com.apimonedas.apimonedas.repositorio;

import org.springframework.stereotype.Repository;

import com.apimonedas.apimonedas.modelos.Cambio;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CambioRepositorio  extends JpaRepository<Cambio, Long>{
    


}
