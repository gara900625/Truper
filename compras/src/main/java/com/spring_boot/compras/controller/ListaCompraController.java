package com.spring_boot.compras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot.compras.entity.ListaCompra;
import com.spring_boot.compras.service.ListaCompraService;

@RestController
@RequestMapping("/listacompra")
public class ListaCompraController {
	
	@Autowired
	private ListaCompraService listaCompraS;

	@GetMapping("/listar")
	public List<ListaCompra> obtenerListaCompra(){
		return listaCompraS.obtenerListaCompra();
	}
	
	@GetMapping("/listar/{id}")
	public ListaCompra obtenerListaCompraById(@PathVariable Integer idLista) {
		return listaCompraS.obtenerListaCompraById(idLista);
	}
	
	@GetMapping("/listarc/{id}")
	public List<ListaCompra> obtenerListaCompraByCliente(@PathVariable Integer customerId){
		return listaCompraS.obtenerListaCompraByCliente(customerId);
	}
	
	@PostMapping("/guardar")
	public ListaCompra guardarListaCompra(@RequestBody ListaCompra listaCompra) {
		return listaCompraS.guardarListaCompra(listaCompra);
	}
	
	@PutMapping("/modificar/{id}")
	public ListaCompra modificarListaCompra(@PathVariable Integer idLista,@RequestBody ListaCompra listaCompra) {
		return listaCompraS.modificarListaCompra(idLista, listaCompra);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarListaCompra(Integer idLista) {
		listaCompraS.eliminarListaCompra(idLista);
	}
}
