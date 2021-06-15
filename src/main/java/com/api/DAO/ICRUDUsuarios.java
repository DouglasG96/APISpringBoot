package com.api.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.api.entities.Persona;
import com.api.entities.Usuarios;
public interface ICRUDUsuarios extends CrudRepository<Usuarios, Integer> {
	
	/*
	public List<Usuarios> findAll();
	
	public Optional<Usuarios> findById(Integer idPersona);
	
	public <S extends Persona> S save(S persona);
	
	public void deleteById(Integer idPersona);
	
	public boolean existsById(Integer id);

	
	public Usuarios logIn(String user, String pass);
	*/
}
