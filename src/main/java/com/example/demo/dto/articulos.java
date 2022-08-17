package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Id;

@Entity
@Table(name = "articulos")
public class articulos {

//ATRIBUTOS TABLA FABRICANTES

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nombre;
	private int precio;

	@ManyToOne
	@JoinColumn(name = "fabricanteId")
	private fabricantes fabricantes;

	// CONSTRUCTORES
	public articulos() {

	}

	public articulos(Long id, String nombre, int precio) {
		super();
		Id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	// GETTERS Y SETTERS

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	// TO STRING
	@Override
	public String toString() {
		return "articulos [Id=" + Id + ", nombre=" + nombre + ", precio=" + precio + ", fabricanteId=" + fabricantes
				+ "]";
	}

}
