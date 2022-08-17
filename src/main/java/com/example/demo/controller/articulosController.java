package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.articulos;
import com.example.demo.service.articulosServiceImpl;


@RestController
@RequestMapping("/api")
public class articulosController {

	@Autowired
	articulosServiceImpl articulosServiceImpl;
	
	@GetMapping("/articulos")
	public List<articulos> listarArticulos(){
		return articulosServiceImpl.listarArticulos();
	}
	@PostMapping("/articulos")
	public articulos guardarArticulos(@RequestBody articulos articulos) {
		
		return articulosServiceImpl.guardarArticulos(articulos);
	}
	@GetMapping("/articulos/{id}")
	public articulos articulosPorID(@PathVariable(name="id") Long id) {

		articulos articulo_porid= new articulos();
		articulo_porid=articulosServiceImpl.articulosPorID(id);
		System.out.println("Articulos por ID: "+articulo_porid);
		return articulo_porid;
	}
	
	@PutMapping("/articulos/{id}")
	public articulos actualizarArticulo(@PathVariable(name="id")Long id,@RequestBody articulos articulos) {
		
		articulos articulo_seleccionado= new articulos();
		articulos articulo_actualizado= new articulos();
		
		articulo_seleccionado= articulosServiceImpl.articulosPorID(id);
		
		articulo_seleccionado.setNombre(articulos.getNombre());
		articulo_seleccionado.setPrecio(articulos.getPrecio());
		
		articulo_actualizado = articulosServiceImpl.actualizarArticulo(articulo_seleccionado);
		
		System.out.println("Articulo actualizado: "+ articulo_actualizado);
		
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eliminarArticulo(@PathVariable(name="id")Long id) {
		articulosServiceImpl.eliminarArticulo(id);
	}
}
