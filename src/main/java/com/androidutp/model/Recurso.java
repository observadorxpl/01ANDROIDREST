package com.androidutp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "RECURSO")
public class Recurso {
	@Id
	@Column(name="ID_RECURSO")
	@GeneratedValue(generator= "seq_Recurso")
	@SequenceGenerator(name="seq_Recurso", sequenceName = "SEQ_RECURSO", allocationSize= 1)
	private int idRecurso;
	
	@ManyToOne
	@JoinColumn(name= "ID_PRODUCTO")
	@JsonIgnore
	private Producto producto;
	
	@Column(name="ENLACE", nullable = false)
	private String enlace;
	
	public Recurso() {
		super();
	}

	public int getIdRecurso() {
		return idRecurso;
	}

	public void setIdRecurso(int idRecurso) {
		this.idRecurso = idRecurso;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Recurso [idRecurso=" + idRecurso + ", enlace=" + enlace + ", producto=" + producto + "]";
	}
	
	
	
}
