package com.novell.utopia.cursomvc.dao;

import java.util.List;

import com.novell.utopia.cursomvc.domain.Funcionario;


public interface FuncionarioDao {
	
	void save(Funcionario departamento);

	void update(Funcionario departamento);

	void delete(Long id);

	Funcionario findById(Long id);

	List<Funcionario> findAll();

}
