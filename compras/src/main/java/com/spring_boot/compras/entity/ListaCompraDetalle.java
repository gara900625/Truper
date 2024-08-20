package com.spring_boot.compras.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name="listacompradetalle")
public class ListaCompraDetalle {
	
	@EmbeddedId
	private ListaCompraDetalleId id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idlista", nullable=false)
	private ListaCompra listaCompra;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idproducto", nullable=false)
	private Productos productos;
	
	@Column(name="cantidad")
	private Integer cantidad;

	public ListaCompraDetalleId getId() {
		return id;
	}

	public void setId(ListaCompraDetalleId id) {
		this.id = id;
	}

	public ListaCompra getListaCompra() {
		return listaCompra;
	}

	public void setListaCompra(ListaCompra listaCompra) {
		this.listaCompra = listaCompra;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
}
