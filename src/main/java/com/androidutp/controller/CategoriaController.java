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

import com.androidutp.model.Categoria;
import com.androidutp.service.ICategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {
	@Autowired
	private ICategoriaService service;
	
	@PostMapping
	public ResponseEntity<Categoria> registrar(@RequestBody Categoria categoria){
		Categoria cat = new Categoria();
		try {
			cat = service.registrar(categoria);
		} catch (Exception e) {
			new ResponseEntity<Categoria>(cat, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Categoria>(cat, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Categoria>> listar(){
		List<Categoria> lista = new ArrayList<>();
		try {
			lista =service.listar();
		} catch (Exception e) {
			new ResponseEntity<List<Categoria>>(lista, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<Categoria>>(lista, HttpStatus.OK);
	}
}
