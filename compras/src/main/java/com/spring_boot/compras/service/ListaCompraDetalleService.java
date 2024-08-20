package com.spring_boot.compras.service;

import java.util.List;

import com.spring_boot.compras.entity.ListaCompraDetalle;

public interface ListaCompraDetalleService {
	
	public List<ListaCompraDetalle> obtenerListaCompraDetalle();
	public ListaCompraDetalle guardarListaCompraDetalle(ListaCompraDetalle listaCompraDetalle);

}
