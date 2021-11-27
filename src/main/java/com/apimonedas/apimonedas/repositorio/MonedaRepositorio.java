package com.apimonedas.apimonedas.repositorio;


import java.util.List;

import com.apimonedas.apimonedas.modelos.Moneda;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MonedaRepositorio extends JpaRepository<Moneda, Long> {
    
    List<Moneda> findByNombre(@Param("nombre") String nombre);
    
}
