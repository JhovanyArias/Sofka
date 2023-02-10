package com.app.web.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "naves")
public class Persona { //cree la clase llamada persona para dejar las variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;  //variables id tipo entero
	private int codigo; //variable codigo tipo entero
	private String nombre; //variable name tipo string
	private String pais_creacion; //variable pais de creacion tipo string
	private String activo; //variable activo tipo string
	private String combustible; //variable combustible tipo string
	private String tipo; //variable tipo tipo string
	
	public Persona() {
		// TODO Auto-generated constructor stub 
	}

	public Persona(int id, int codigo, String nombre, String pais_creacion, String activo, String combustible,
			String tipo) {
		super();                            // se crea el consultor para insertar el getter y setter
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.pais_creacion = pais_creacion;
		this.activo = activo;
		this.combustible = combustible;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais_creacion() {
		return pais_creacion;
	}

	public void setPais_creacion(String pais_creacion) {
		this.pais_creacion = pais_creacion;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	}
	

