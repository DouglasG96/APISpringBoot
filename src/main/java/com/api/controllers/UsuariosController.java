package com.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.api.DAO.ICRUDPersonas;
import com.api.DAO.ICRUDUsuarios;
import com.api.entities.Persona;
import com.api.entities.Usuarios;

@RestController
@RequestMapping("/api")
public class UsuariosController {
	@Autowired
	private ICRUDUsuarios iCrudUsuarios;
	
	@PostMapping("/login")
	public Usuarios logIn(@RequestParam("nombreUsuario") String nombreUsuario, @RequestParam("clave") String clave, UriComponentsBuilder builder)
	{
		return iCrudUsuarios.logIn(nombreUsuario, clave);
	}
	
}
