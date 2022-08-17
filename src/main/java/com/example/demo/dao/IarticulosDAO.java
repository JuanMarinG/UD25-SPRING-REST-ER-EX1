package com.example.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.articulos;
public interface IarticulosDAO extends JpaRepository<articulos, Long>{
	
}
