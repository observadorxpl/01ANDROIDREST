package com.androidutp.service;

import java.util.List;


public interface ICRUD<T> {
	T registrar(T t);
	void modificar(T t);
	void eliminar(int t);
	T listarId(int t);
	List<T> listar();
}
