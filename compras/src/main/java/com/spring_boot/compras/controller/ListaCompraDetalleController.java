package com.spring_boot.compras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot.compras.entity.ListaCompraDetalle;
import com.spring_boot.compras.service.ListaCompraDetalleService;

@RestController
@RequestMapping("/listacompradetalle")
public class ListaCompraDetalleController {
	
	@Autowired
	private ListaCompraDetalleService listaCompraDetalleS;
	
	@GetMapping("/listar")
	public List<ListaCompraDetalle> obtenerListaCompraDetalle(){
		return listaCompraDetalleS.obtenerListaCompraDetalle();
	}
	
	@PostMapping("/guardar")
	public ListaCompraDetalle guardarListaCompraDetalle(@RequestBody ListaCompraDetalle listaCompraDetalle) {
		return listaCompraDetalleS.guardarListaCompraDetalle(listaCompraDetalle);
	}

}
