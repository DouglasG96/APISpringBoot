package com.api.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.api.entities.Persona;
public interface ICRUDPersonas extends CrudRepository<Persona, Integer> {
	
	public List<Persona> findAll();
	
	public Optional<Persona> findById(Integer idPersona);
	
	public <S extends Persona> S save(S persona);
	
	public void deleteById(Integer idPersona);
	
	public boolean existsById(Integer id);
}
