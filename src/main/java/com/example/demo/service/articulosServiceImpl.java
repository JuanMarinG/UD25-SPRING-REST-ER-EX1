package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IarticulosDAO;
import com.example.demo.dto.articulos;

@Service
public class articulosServiceImpl implements IarticulosService{

	
	@Autowired
	IarticulosDAO iarticulosDAO;

	public List<articulos> listarArticulos() {

		return iarticulosDAO.findAll();
	}

	@Override
	public  articulos guardarArticulos(articulos articulos) {

		return iarticulosDAO.save(articulos);
	}

	@Override
	public articulos articulosPorID(Long id) {

		return iarticulosDAO.findById(id).get();
	}

	@Override
	public articulos actualizarArticulo(articulos articulos) {

		return iarticulosDAO.save(articulos);
	}

	@Override
	public void eliminarArticulo(Long id) {

		iarticulosDAO.deleteById(id);

	}

	



}