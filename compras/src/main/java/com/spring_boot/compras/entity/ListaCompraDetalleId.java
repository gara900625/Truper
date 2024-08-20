package com.spring_boot.compras.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Embeddable
public class ListaCompraDetalleId {
	
	@Column(name="id_lista_compra")
	private Integer idListaCompra;
	
	@Column(name="id_codigo_producto")
	private Integer idCodigoProducto;

	public ListaCompraDetalleId() {
		
	}

	public ListaCompraDetalleId(Integer idListaCompra, Integer idCodigoProducto) {
		super();
		this.idListaCompra = idListaCompra;
		this.idCodigoProducto = idCodigoProducto;
	}

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
}
