package com.androidutp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "USUARIO")
public class Usuario {
	@Id
	@Column(name="ID_USUARIO")
	@GeneratedValue(generator= "seq_Usuario")
	@SequenceGenerator(name="seq_Usuario", sequenceName = "SEQ_USUARIO", allocationSize= 1)
	private int idUsuario;
	
	@Column(name= "USUARIO", nullable = false, length = 70)
	private String usuario;
	
	@Column(name= "CONTRASEÑA", nullable = false, length = 70)
	private String contraseña;

	@ManyToOne
	@JoinColumn(name = "ID_ROL")
	private Rol rol;
	
	public Usuario() {
		super();
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Usuario(int idUsuario, String usuario, String contraseña) {
		super();
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", usuario=" + usuario + ", contraseña=" + contraseña + ", rol="
				+ rol + "]";
	}


	
	
}
