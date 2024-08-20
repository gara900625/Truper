package com.spring_boot.compras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot.compras.entity.Clientes;
import com.spring_boot.compras.repository.ClientesRepository;

import jakarta.transaction.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClientesRepository clientesR;

	@Override
	@Transactional
	public List<Clientes> obtenerClientes() {
		return (List<Clientes>) clientesR.findAll();
	}

	@Override
	@Transactional
	public Clientes guardarCliente(Clientes cliente) {
		return clientesR.save(cliente);
	}

}
