package com.novell.utopia.cursomvc.services;

import java.util.List;

import com.novell.utopia.cursomvc.domain.Cargo;

public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);	
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();
}
