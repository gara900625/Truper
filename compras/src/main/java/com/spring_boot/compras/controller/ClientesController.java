package com.spring_boot.compras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot.compras.entity.Clientes;
import com.spring_boot.compras.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
	
	@Autowired
	private ClienteService clienteS;
	
	@GetMapping("/listar")
	public List<Clientes> obtenerClientes(){
		return clienteS.obtenerClientes();
	}
	
	@PostMapping("/guardar")
	public Clientes guardarCliente(@RequestBody Clientes cliente) {
		return clienteS.guardarCliente(cliente);
	}
	

}
