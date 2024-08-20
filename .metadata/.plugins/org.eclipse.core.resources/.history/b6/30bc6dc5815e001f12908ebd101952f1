package com.spring_boot.compras.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot.compras.entity.ListaCompra;
import com.spring_boot.compras.repository.ListaCompraRepository;

@Service
public class ListaCompraServiceImpl implements ListaCompraService {
	
	@Autowired
	private ListaCompraRepository listaCompraR; 

	@Override
	public List<ListaCompra> obtenerListaCompra() {
		return (List<ListaCompra>) listaCompraR.findAll();
	}

	@Override
	public ListaCompra guardarListaCompra(ListaCompra listaCompra) {
		listaCompra.setFechaRegistro(new Date());
		listaCompra.setFechaUltimaActualizacion(new Date());
		return listaCompraR.save(listaCompra);
	}

	@Override
	public ListaCompra modificarListaCompra(Integer idLista, ListaCompra listaCompra) {
		ListaCompra listaCompraB = listaCompraR.findById(idLista).orElse(null);
		if(listaCompraB != null)
		{
			listaCompraB.setNombre(listaCompra.getNombre());
			listaCompraB.setCustomerId(listaCompra.getCustomerId());
			listaCompraB.setFechaUltimaActualizacion(new Date());
			
			listaCompraB = listaCompraR.save(listaCompraB);
		}
		
		return listaCompraB;
	}

}
