package com.androidutp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "CATEGORIA")
public class Categoria {
	@Id
	@Column(name="ID_CATEGORIA")
	@GeneratedValue(generator= "seq_Categoria")
	@SequenceGenerator(name="seq_Categoria", sequenceName = "SEQ_CATEGORIA", allocationSize= 1)
	private int idCategoria;
	
	@Column(name= "ACRONIMO", nullable = false, length = 70)
	private String acronimo;
	
	@Column(name= "DESCRIPCION", nullable = false, length = 70)
	private String descripcion;
	
	
	public Categoria() {
		super();
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getAcronimo() {
		return acronimo;
	}

	public void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", descripcion=" + descripcion + ", acronimo=" + acronimo
				+ "]";
	}
	
	
	
}
