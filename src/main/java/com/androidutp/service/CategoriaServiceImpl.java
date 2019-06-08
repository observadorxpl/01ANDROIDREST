package com.androidutp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.androidutp.model.Categoria;
import com.androidutp.repository.ICategoriaDAO;
@Service
public class CategoriaServiceImpl implements ICategoriaService{
	@Autowired
	private ICategoriaDAO dao;
	@Override
	public Categoria registrar(Categoria cat) {
		return dao.save(cat);
	}

	@Override
	public void modificar(Categoria cat) {
		dao.save(cat);
	}

	@Override
	public void eliminar(int idcat) {
		dao.delete(idcat);
	}

	@Override
	public Categoria listarId(int idcat) {
		return dao.findOne(idcat);
	}

	@Override
	public List<Categoria> listar() {
		return dao.findAll();
	}

}
