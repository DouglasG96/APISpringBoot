package com.api.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.api.entities.Persona;
public interface ICRUDPersonas extends CrudRepository<Persona, Integer> {
	public List<Persona> findAll();
}
