package com.api.models;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.DAO.ICRUDPersonas;
import com.api.DAO.ICRUDUsuarios;
import com.api.entities.Persona;
import com.api.entities.Usuarios;

public class UsuariosModel implements ICRUDUsuarios{

	 private ICRUDUsuarios interfaceUsuarios;

	   @Autowired
	   public UsuariosModel(ICRUDUsuarios interfaceUsuarios ){
	      this.interfaceUsuarios = interfaceUsuarios;
	   }

	@Override
	public <S extends Usuarios> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuarios> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuarios> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Usuarios> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Usuarios> findAllById(Iterable<Integer> ids) {
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Usuarios entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Usuarios> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}
