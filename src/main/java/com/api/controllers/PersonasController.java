package com.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.DAO.ICRUDPersonas;
import com.api.entities.Persona;

@RestController
@RequestMapping("/api")
public class PersonasController {

	@Autowired
	private ICRUDPersonas iCrudPersonas;
	
	@GetMapping("/personas")
	public List<Persona> findAll()
	{
		return iCrudPersonas.findAll();
	}
}
