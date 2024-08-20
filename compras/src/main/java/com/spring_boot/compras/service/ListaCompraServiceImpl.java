package com.spring_boot.compras.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot.compras.entity.Clientes;
import com.spring_boot.compras.entity.ListaCompra;
import com.spring_boot.compras.repository.ClientesRepository;
import com.spring_boot.compras.repository.ListaCompraRepository;

import jakarta.transaction.Transactional;

@Service
public class ListaCompraServiceImpl implements ListaCompraService {
	
	@Autowired
	private ListaCompraRepository listaCompraR;
	
	@Autowired
	private ClientesRepository clientesR;

	@Override
	@Transactional
	public List<ListaCompra> obtenerListaCompra() {
		return (List<ListaCompra>) listaCompraR.findAll();
	}

	@Override
	@Transactional
	public ListaCompra guardarListaCompra(ListaCompra listaCompra) {
		listaCompra.setFechaRegistro(new Date());
		listaCompra.setFechaUltimaActualizacion(new Date());
		return listaCompraR.save(listaCompra);
	}

	@Override
	@Transactional
	public ListaCompra modificarListaCompra(Integer idLista, ListaCompra listaCompra) {
		ListaCompra listaCompraB = listaCompraR.findById(idLista).orElse(null);
		if(listaCompraB != null)
		{
			listaCompraB.setNombre(listaCompra.getNombre());
			listaCompraB.setCliente(listaCompra.getCliente());
			listaCompraB.setFechaUltimaActualizacion(new Date());
			listaCompraB.setListaCompraDetalle(listaCompra.getListaCompraDetalle());
			
			listaCompraB = listaCompraR.save(listaCompraB);
		}
		
		return listaCompraB;
	}

	@Override
	@Transactional
	public ListaCompra obtenerListaCompraById(Integer idLista) {
		return listaCompraR.findById(idLista).orElse(null);
	}

	@Override
	@Transactional
	public List<ListaCompra> obtenerListaCompraByCliente(Integer customerId) {
		Clientes cliente = clientesR.findById(customerId).orElse(null);
		List<ListaCompra> listaCompra = new ArrayList();
		if(cliente != null)
		{
			listaCompra = listaCompraR.findByCliente(cliente);
		}
		return listaCompra;
	}

	@Override
	@Transactional
	public void eliminarListaCompra(Integer idLista) {
		listaCompraR.deleteById(idLista);
	}

}
