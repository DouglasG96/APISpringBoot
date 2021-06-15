package com.api.models;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.DAO.ICRUDPersonas;
import com.api.entities.Persona;

public class PersonasModel implements ICRUDPersonas{

	 private ICRUDPersonas interfacePersona;

	   @Autowired
	   public PersonasModel(ICRUDPersonas interfacePersona ){
	      this.interfacePersona = interfacePersona;
	   }
	
	@Override
	public <S extends Persona> S save(S entity) {
		return interfacePersona.save(entity);
	}
	
	@Override
	public <S extends Persona> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Persona> findById(Integer id) {
		return interfacePersona.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return interfacePersona.existsById(id);
	}

	@Override
	public Iterable<Persona> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		interfacePersona.deleteById(id);
	}

	@Override
	public void delete(Persona entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Persona> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Persona> findAll() {
		return interfacePersona.findAll();
	}
}
