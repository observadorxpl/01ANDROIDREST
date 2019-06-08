package com.androidutp.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.androidutp.model.Usuario;
import com.androidutp.service.IUsuarioService;
@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService service;
	
	@PostMapping
	public ResponseEntity<Usuario> registrar(@RequestBody Usuario usuario){
		Usuario usu = new Usuario();
		try {
			usu = service.registrar(usuario);
		} catch (Exception e) {
			new ResponseEntity<Usuario>(usu, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Usuario>(usu, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Usuario>> listar(){
		List<Usuario> lista = new ArrayList<>();
		try {
			lista =service.listar();
		} catch (Exception e) {
			new ResponseEntity<List<Usuario>>(lista, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<Usuario>>(lista, HttpStatus.OK);
	}
	///eliminar/{id}
	@GetMapping(value = "/login/{usuario}/{contrasenia}")
	public ResponseEntity<Usuario> login(@PathVariable("usuario")String usuario, @PathVariable("contrasenia") String contrasenia){
		Usuario usu = new Usuario();
		try {
			usu =service.login(usuario,contrasenia);
		} catch (Exception e) {
			new ResponseEntity<Usuario>(usu, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Usuario>(usu, HttpStatus.OK);
	}
}
