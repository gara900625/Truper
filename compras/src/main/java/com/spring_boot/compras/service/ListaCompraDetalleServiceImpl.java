package com.spring_boot.compras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot.compras.entity.ListaCompraDetalle;
import com.spring_boot.compras.repository.ListaCompraDetalleRepository;

import jakarta.transaction.Transactional;

@Service
public class ListaCompraDetalleServiceImpl implements ListaCompraDetalleService {

	@Autowired
	private ListaCompraDetalleRepository listaCompraDetalleR;
	
	@Override
	@Transactional
	public List<ListaCompraDetalle> obtenerListaCompraDetalle() {
		return (List<ListaCompraDetalle>) listaCompraDetalleR.findAll();
	}

	@Override
	@Transactional
	public ListaCompraDetalle guardarListaCompraDetalle(ListaCompraDetalle listaCompraDetalle) {
		return listaCompraDetalleR.save(listaCompraDetalle);
	}

}
