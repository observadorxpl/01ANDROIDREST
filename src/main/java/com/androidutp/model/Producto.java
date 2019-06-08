package com.androidutp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTO")
public class Producto {
	@Id
	@Column(name="ID_PRODUCTO")
	@GeneratedValue(generator= "seq_Producto")
	@SequenceGenerator(name="seq_Producto", sequenceName = "SEQ_PRODUCTO", allocationSize= 1)
	private int idProducto;
	
	@Column(name= "DESCRIPCION", nullable = false, length = 70)
	private String descripcion;
	
	@Column(name= "PRECIO_COMPRA", nullable = false)
	private double precioCompra;
	
	@Column(name= "PRECIO_VENTA", nullable = false)
	private double precioVenta;
	
	@Column(name= "STOCK", nullable = false)
	private int stock;
	
	@ManyToOne
	@JoinColumn(name = "ID_CATEGORIA")
	private Categoria categoria;

	// LAZY = Permite tener un mejor rendimiento. La consulta JPQL.
	// OrphanRemoval = Permite remover un elemento de la lista de la BD
	@OneToMany(mappedBy= "producto", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, 
			fetch = FetchType.LAZY, orphanRemoval = true)
	private List<Recurso> detalleProducto;
	
	public Producto() {
		super();
	}


	public Producto(int idProducto, String descripcion, double precioCompra, double precioVenta, int stock,
			Categoria categoria, List<Recurso> detalleProducto) {
		super();
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
		this.categoria = categoria;
		this.detalleProducto = detalleProducto;
	}


	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public List<Recurso> getDetalleProducto() {
		return detalleProducto;
	}

	public void setDetalleProducto(List<Recurso> detalleProducto) {
		this.detalleProducto = detalleProducto;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", descripcion=" + descripcion + ", precioCompra=" + precioCompra
				+ ", precioVenta=" + precioVenta + ", stock=" + stock + ", categoria=" + categoria
				+ ", detalleProducto=" + detalleProducto + "]";
	}



	
}
