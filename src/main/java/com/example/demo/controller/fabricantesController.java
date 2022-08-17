package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.fabricantes;
import com.example.demo.service.fabricantesServiceImpl;

public class fabricantesController {

	@Autowired
	fabricantesServiceImpl fabricantesServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<fabricantes> listarFabricantes(){
		return fabricantesServiceImpl.listarFabricantes();
	}
	@PostMapping("/fabricantes")
	public fabricantes guardarArticulos(@RequestBody fabricantes fabricantes) {
		
		return fabricantesServiceImpl.guardarFabricante(fabricantes);
	}
	@GetMapping("/fabricantes/{id}")
	public fabricantes fabricantesPorID(@PathVariable(name="id") Long id) {

		fabricantes fabricante_porid= new fabricantes();
		fabricante_porid=fabricantesServiceImpl.FabricantesPorID(id);
		System.out.println("Fabricantes por ID: "+fabricante_porid);
		return fabricante_porid;
	}
	
	@PutMapping("/fabricantes/{id}")
	public fabricantes actualizarFabricante(@PathVariable(name="id")Long id,@RequestBody fabricantes fabricantes) {
		
		fabricantes fabricante_seleccionado= new fabricantes();
		fabricantes fabricante_actualizado= new fabricantes();
		
		fabricante_seleccionado= fabricantesServiceImpl.FabricantesPorID(id);
		
		fabricante_seleccionado.setNombre(fabricantes.getNombre());
		
		fabricante_actualizado = fabricantesServiceImpl.actualizarFabricante(fabricante_seleccionado);
		
		System.out.println("Fabricante actualizado: "+ fabricante_actualizado);
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void eliminarArticulo(@PathVariable(name="id")Long id) {
		fabricantesServiceImpl.eliminarFabricante(id);
	}
}

