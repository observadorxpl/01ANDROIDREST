package com.androidutp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.androidutp.model.Rol;
@Repository
public interface IRolDAO extends JpaRepository<Rol, Integer>{

}
