package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IfabricantesDAO;
import com.example.demo.dto.fabricantes;

public class fabricantesServiceImpl implements IfabricantesService {

	@Autowired
	IfabricantesDAO ifabricantesDAO;
	
	public List<fabricantes> listarFabricantes() {

		return ifabricantesDAO.findAll();
	}
	
	@Override
	public  fabricantes guardarFabricante(fabricantes fabricantes) {

		return ifabricantesDAO.save(fabricantes);
	}

	@Override
	public fabricantes actualizarFabricante(fabricantes fabricantes) {
		// TODO Auto-generated method stub
		return ifabricantesDAO.save(fabricantes);
	}

	@Override
	public void eliminarFabricante(Long id) {
		// TODO Auto-generated method stub
		ifabricantesDAO.deleteById(id);
	}

	@Override
	public fabricantes FabricantesPorID(Long id) {
		// TODO Auto-generated method stub
		return ifabricantesDAO.findById(id).get();
	}
}
