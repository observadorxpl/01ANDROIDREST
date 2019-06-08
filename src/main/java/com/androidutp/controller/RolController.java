package com.androidutp.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.androidutp.model.Rol;
import com.androidutp.service.IRolService;

@RestController
@RequestMapping(value = "/roles")
public class RolController {
	
	@Autowired
	private IRolService service;
	
	@PostMapping
	public ResponseEntity<Rol> registrar(@RequestBody Rol rol){
		Rol usu = new Rol();
		try {
			usu = service.registrar(rol);
		} catch (Exception e) {
			new ResponseEntity<Rol>(usu, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Rol>(usu, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Rol>> listar(){
		List<Rol> lista = new ArrayList<>();
		try {
			lista =service.listar();
		} catch (Exception e) {
			new ResponseEntity<List<Rol>>(lista, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<Rol>>(lista, HttpStatus.OK);
	}
}
