package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.articulos;

public interface IarticulosService {

	public List<articulos> listarArticulos(); // All

	// UPDATE
	public  articulos actualizarArticulo(articulos articulos);

	// CREATE
	public articulos guardarArticulos(articulos articulos);

	// DELETE
	public void eliminarArticulo(Long id);

	// READ
	public articulos articulosPorID(Long id);

}
