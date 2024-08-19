package com.spring_boot.compras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot.compras.entity.ListaCompraDetalle;
import com.spring_boot.compras.repository.ListaCompraDetalleRepository;

@Service
public class ListaCompraDetalleServiceImpl implements ListaCompraDetalleService {

	@Autowired
	private ListaCompraDetalleRepository listaCompraDetalleR;
	
	@Override
	public List<ListaCompraDetalle> obtenerListaCompraDetalle() {
		return (List<ListaCompraDetalle>) listaCompraDetalleR.findAll();
	}

	@Override
	public List<ListaCompraDetalle> obtenerListaCompraDetalleByIdCliente(Integer idCliente) {
		return listaCompraDetalleR.findByIdCliente(idCliente);
	}

	@Override
	public ListaCompraDetalle guardarListaCompraDetalle(ListaCompraDetalle listaCompraDetalle) {
		return listaCompraDetalleR.save(listaCompraDetalle);
	}

	@Override
	public ListaCompraDetalle modificarListaCompraDetalle(ListaCompraDetalle listaCompraDetalle) {
		//ListaCompraDetalle
		
		return null;
	}

	@Override
	public void eliminarListaCompraDetalle(Integer idListaCompra, Integer idCodigoProducto) {
		// TODO Auto-generated method stub
		
	}

}
