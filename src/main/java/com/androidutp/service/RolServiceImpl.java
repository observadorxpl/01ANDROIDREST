package com.androidutp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.androidutp.model.Rol;
import com.androidutp.repository.IRolDAO;

@Service
public class RolServiceImpl implements IRolService {
	@Autowired
	private IRolDAO dao;

	@Override
	public Rol registrar(Rol rol) {
		return dao.save(rol);
	}

	@Override
	public void modificar(Rol rol) {
		dao.save(rol);
	}

	@Override
	public void eliminar(int idRol) {
		dao.delete(idRol);
	}

	@Override
	public Rol listarId(int idRol) {
		return dao.findOne(idRol);
	}

	@Override
	public List<Rol> listar() {
		return dao.findAll();
	}
}
