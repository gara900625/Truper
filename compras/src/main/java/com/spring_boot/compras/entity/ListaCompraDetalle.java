package com.spring_boot.compras.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="ListaCompraDetalle")
public class ListaCompraDetalle {
	
	@Column(name="id_lista_compra")
	private Integer idListaCompra;
	
	@Column(name="id_codigo_producto")
	private Integer idCodigoProducto;
	
	@Column(name="cantidad")
	private Integer cantidad;

	public Integer getIdListaCompra() {
		return idListaCompra;
	}

	public void setIdListaCompra(Integer idListaCompra) {
		this.idListaCompra = idListaCompra;
	}

	public Integer getIdCodigoProducto() {
		return idCodigoProducto;
	}

	public void setIdCodigoProducto(Integer idCodigoProducto) {
		this.idCodigoProducto = idCodigoProducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
}
