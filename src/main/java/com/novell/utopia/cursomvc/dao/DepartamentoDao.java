package com.novell.utopia.cursomvc.dao;

import java.util.List;

import com.novell.utopia.cursomvc.domain.Departamento;

public interface DepartamentoDao {
	
	void save(Departamento departamento);
	
	void update(Departamento departamento);
	
	void delete(Long id);
	
	Departamento findById(Long id);
	
	List<Departamento> findAll();

}
