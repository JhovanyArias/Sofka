package com.app.web.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.web.modelo.Persona;

@Repository
public interface interfacePersona extends CrudRepository<Persona, Integer> {

}
 
// interface persona, se extiende de la clase crudrepository, objeto persona