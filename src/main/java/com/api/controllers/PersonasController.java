package com.api.controllers;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

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
	
	@GetMapping("/personas/{idPersona}")
	public Optional<Persona> getPersonaById(@PathVariable("idPersona") Integer idPersona)
	{
		return iCrudPersonas.findById(idPersona);
	}
	
	@PostMapping("/personas")
	public Persona addPersona(@RequestBody Persona persona, UriComponentsBuilder builder) {
		try
		{
			iCrudPersonas.save(persona);
			//Redireccionar al nuevo objeto
			HttpHeaders headers = new HttpHeaders();
	        headers.setLocation((builder.path("/api/personas/{id}").buildAndExpand(persona.getIdpersona())).toUri());
	        return persona;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	@PutMapping("/personas")
	public ResponseEntity<Persona> updatePersona(@RequestBody Persona persona) {
		try
		{
			iCrudPersonas.save(persona);
			return new ResponseEntity<Persona>(HttpStatus.OK);	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	@DeleteMapping("/personas/{idPersona}")
	public ResponseEntity<Void> deletePersona(@PathVariable("idPersona") Integer idPersona) {
		iCrudPersonas.deleteById(idPersona);
		if(!iCrudPersonas.existsById(idPersona))
		{
			return new ResponseEntity<Void>(HttpStatus.OK);	
		}
		else
		{
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}

	}
}
