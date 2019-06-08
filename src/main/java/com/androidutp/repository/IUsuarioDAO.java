package com.androidutp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.androidutp.model.Usuario;

@Repository
public interface IUsuarioDAO extends JpaRepository<Usuario, Integer> {
	@Query(value = "SELECT * FROM USUARIO WHERE usuario = :usuario AND contraseña = :contrasenia", nativeQuery = true)
	Usuario login(@Param("usuario")String usuario, @Param("contrasenia")String contrasenia);
}
