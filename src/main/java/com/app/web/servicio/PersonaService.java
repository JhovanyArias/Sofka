package com.app.web.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.interfaceService.IPersonaService;
import com.app.web.interfaces.interfacePersona;
import com.app.web.modelo.Persona;

// en esta clase se implementan los metodos creados en interfacepersona como listar, guardar, eliminar	
@Service
public class PersonaService implements IPersonaService  {

	@Autowired
	private interfacePersona data; 
		
	@Override
	public List<Persona> listar() {             //metodo listar
		return (List<Persona>)data.findAll();
	}
	
	@Override
	public Optional<Persona> listarId(int id) {  //metodo listar por id
		return data.findById(id);
    }

	@Override
	public int save(Persona p) {           //metodo guardar
		int res=0;
		Persona persona=data.save(p);
		if (!persona.equals(null)) {
		     res=1;
	    }
	    return res;
	}
	@Override                             //metodo eliminar
	public void delete(int id) {
		data.deleteById(id);
	}

}
