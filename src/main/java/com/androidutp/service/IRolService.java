package com.androidutp.service;

import java.util.List;

import com.androidutp.model.Rol;

public interface IRolService {
	Rol registrar(Rol rol);
	void modificar(Rol rol);
	void eliminar(int idRol);
	Rol listarId(int idRol);
	List<Rol> listar();
}
