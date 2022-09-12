package com.novell.utopia.cursomvc.dao;

import java.util.List;

import com.novell.utopia.cursomvc.domain.Cargo;

public interface CargoDao {

	void save(Cargo departamento);

	void update(Cargo departamento);

	void delete(Long id);

	Cargo findById(Long id);

	List<Cargo> findAll();

}
