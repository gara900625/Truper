package com.spring_boot.compras.service;

import java.util.List;

import com.spring_boot.compras.entity.ListaCompra;

public interface ListaCompraService {
	
	public List<ListaCompra> obtenerListaCompra();
	public ListaCompra guardarListaCompra(ListaCompra listaCompra);
	public ListaCompra modificarListaCompra(Integer idLista, ListaCompra listaCompra);

}
