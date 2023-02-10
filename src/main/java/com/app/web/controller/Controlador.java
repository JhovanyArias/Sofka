package com.app.web.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.web.interfaceService.IPersonaService;
import com.app.web.modelo.Persona;

@Controller //anotacion controller
@RequestMapping 
public class Controlador {
	
	@Autowired 
	private IPersonaService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Persona>personas=service.listar();
		model.addAttribute("personas", personas);
		return "index";	// index es el archivo html
	}	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("persona",new Persona()); //se envia la lista u objeto al formulario
		return "formulario";
	}
	@PostMapping("/save") //metodo guardar
	public String save(@Validated Persona p, Model modelo) { //
		int id=service.save(p);
		if(id==0) {
			return "formulario";
		}
		return "redirect:/listar"; 
	}
	
	@GetMapping("/editar/{id}")  //metodo editar
	public String editar( @PathVariable int id, Model modelo) {
		Optional<Persona>persona=service.listarId(id);
		modelo.addAttribute("persona", persona);
		return "formulario";
		
	}

	@GetMapping ("/eliminar/{id}")  //metodo eliminar
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";	
	
	}
	
}
