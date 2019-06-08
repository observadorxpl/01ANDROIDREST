package com.androidutp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ROL")
public class Rol {
	@Id
	@Column(name="ID_ROL")
	@GeneratedValue(generator= "seq_Rol")
	@SequenceGenerator(name="seq_Rol", sequenceName = "SEQ_ROL", allocationSize= 1)
	private int idRol;
	
	@Column(name= "NOMBRE", nullable = false, length = 70)
	private String nombre;
	
	@Column(name= "DESCRIPCION", nullable = false, length = 70)
	private String descripcion;
	
	
	public Rol() {
		super();
	}
	public int getIdRol() {
		return idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Rol [idRol=" + idRol + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	
}
