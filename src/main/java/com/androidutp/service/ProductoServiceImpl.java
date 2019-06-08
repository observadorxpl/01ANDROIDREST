package com.androidutp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.androidutp.model.Producto;
import com.androidutp.repository.IProductoDAO;

@Service
public class ProductoServiceImpl implements IProductoService{
	@Autowired
	private IProductoDAO dao;
	
	@Override
	public Producto registrar(Producto pro) {
		pro.getDetalleProducto().forEach(x ->{
			x.setProducto(pro);
		});
		return dao.save(pro);
	}

	@Override
	public void modificar(Producto pro) {
		dao.save(pro);
	}

	@Override
	public void eliminar(int idpro) {
		dao.delete(idpro);
	}

	@Override
	public Producto listarId(int idpro) {
		return dao.findOne(idpro);
	}

	@Override
	public List<Producto> listar() {
		return dao.findAll();
	}

}
