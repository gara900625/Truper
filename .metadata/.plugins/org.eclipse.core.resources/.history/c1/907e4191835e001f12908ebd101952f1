package com.spring_boot.compras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot.compras.entity.Clientes;
import com.spring_boot.compras.repository.ClientesRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClientesRepository clientesR;

	@Override
	public List<Clientes> obtenerClientes() {
		return (List<Clientes>) clientesR.findAll();
	}

	@Override
	public Clientes guardarCliente(Clientes cliente) {
		return clientesR.save(cliente);
	}

}
