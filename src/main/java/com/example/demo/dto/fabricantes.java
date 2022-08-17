package com.example.demo.dto;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "fabricantes")
public class fabricantes {

	// ATRIBUTOS TABLA FABRICANTES

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;

	@OneToMany
	@JoinColumn(name = "id")
	private List<articulos> articulos;

	// CONSTRUCTORES
	public fabricantes() {
	}

	public fabricantes(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;

	}

	// GETTERS Y SETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, mappedBy="articulos")
		public List<articulos> getArticulos(){
		return articulos;
	}
	
	public void setArticulos(List<articulos> articulos) {
		this.articulos = articulos;
	}
	
	
	// TO STRING

	

	@Override
	public String toString() {
		return "fabricantes [id=" + id + ", nombre=" + nombre + "]";
	}

}
