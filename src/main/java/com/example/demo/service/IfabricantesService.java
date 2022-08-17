package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.fabricantes;

public interface IfabricantesService {
	
	public List<fabricantes> listarFabricantes(); // All

	// UPDATE
	public  fabricantes actualizarFabricante(fabricantes fabricantes);

	// CREATE
	public fabricantes guardarFabricante(fabricantes fabricantes);

	// DELETE
	public void eliminarFabricante(Long id);

	// READ
	public fabricantes FabricantesPorID(Long id);

}

