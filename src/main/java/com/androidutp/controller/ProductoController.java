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

import com.androidutp.model.Producto;
import com.androidutp.service.IProductoService;

@RestController
@RequestMapping(value = "/productos")
public class ProductoController {
	@Autowired
	private IProductoService service;
	
	@PostMapping
	public ResponseEntity<Producto> registrar(@RequestBody Producto producto){
		Producto pro = new Producto();
		try {
			pro = service.registrar(producto);
		} catch (Exception e) {
			new ResponseEntity<Producto>(pro, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Producto>(pro, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Producto>> listar(){
		List<Producto> lista = new ArrayList<>();
		try {
			lista =service.listar();
		} catch (Exception e) {
			new ResponseEntity<List<Producto>>(lista, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<Producto>>(lista, HttpStatus.OK);
	}
}
