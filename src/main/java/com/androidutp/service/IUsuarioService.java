package com.androidutp.service;

import java.util.List;

import com.androidutp.model.Usuario;

public interface IUsuarioService {
	Usuario registrar(Usuario usuario);
	void modificar(Usuario usuario);
	void eliminar(int idUsuario);
	Usuario listarId(int idUsuario);
	List<Usuario> listar();
	Usuario login(String usuario, String password);
}
