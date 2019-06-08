package com.androidutp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.androidutp.model.Categoria;
@Repository
public interface ICategoriaDAO extends JpaRepository<Categoria, Integer>{

}
