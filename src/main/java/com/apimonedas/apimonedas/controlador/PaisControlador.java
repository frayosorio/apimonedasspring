package com.apimonedas.apimonedas.controlador;

import java.util.List;

import com.apimonedas.apimonedas.modelos.Pais;
import com.apimonedas.apimonedas.repositorio.PaisRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class PaisControlador {

    @Autowired
    private PaisRepositorio repositorio;

    @RequestMapping(value="/obtenerlista", method=RequestMethod.GET)
    public List<Pais> listar(){
        return repositorio.findAll();
    }

    @RequestMapping(value="/obtener/{id}", method=RequestMethod.GET)
    public Pais obtener(@PathVariable long id){
        return repositorio.findById(id).get();
    }

    @RequestMapping(value="/buscar/{nombre}", method=RequestMethod.GET)
    public List<Pais> buscar(@PathVariable("nombre") String nombre){
        return repositorio.findByNombre(nombre);
    }

    @RequestMapping(value = "/actualizar", method = RequestMethod.POST)
    public Pais actualizarPais(@RequestBody Pais pais) {
        return repositorio.save(pais);
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
    public Pais eliminar(@PathVariable long id) {
        Pais pais = repositorio.findById(id).get();
        if (pais != null)
            repositorio.deleteById(id);
        return pais;
    }

}
