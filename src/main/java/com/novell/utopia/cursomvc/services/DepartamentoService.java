package com.novell.utopia.cursomvc.services;

import java.util.List;

import com.novell.utopia.cursomvc.domain.Departamento;

public interface DepartamentoService {
	
	void salvar(Departamento departamento);
	
	void editar(Departamento departamento);
	
	void excluir(Long id);	
	
	Departamento buscarPorId(Long id);
	
	List<Departamento> buscarTodos();

}
