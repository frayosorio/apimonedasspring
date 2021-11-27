package com.apimonedas.apimonedas.repositorio;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.apimonedas.apimonedas.modelos.Pais;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

@Repository
public interface PaisRepositorio extends JpaRepository<Pais, Long> {
    
    List<Pais> findByNombre(@Param("nombre") String nombre);
}
