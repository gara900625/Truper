package com.spring_boot.compras.service;

import java.util.List;

import com.spring_boot.compras.entity.Clientes;

public interface ClienteService {
	
	public List<Clientes> obtenerClientes();
	public Clientes guardarCliente(Clientes cliente);

}
