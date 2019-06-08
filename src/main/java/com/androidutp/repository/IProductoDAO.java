package com.androidutp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.androidutp.model.Producto;
@Repository
public interface IProductoDAO extends JpaRepository<Producto, Integer>{

}
