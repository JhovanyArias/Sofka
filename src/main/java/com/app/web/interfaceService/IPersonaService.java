package com.app.web.interfaceService;

import java.util.List;
import java.util.Optional;

import com.app.web.modelo.Persona;

public interface IPersonaService {
	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delete(int id);
	}


//aqui se agregan metodos listar, listar por id, metodo guardar y metodo eliminar