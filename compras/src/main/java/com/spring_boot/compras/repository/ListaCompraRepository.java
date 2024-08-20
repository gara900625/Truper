package com.spring_boot.compras.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring_boot.compras.entity.Clientes;
import com.spring_boot.compras.entity.ListaCompra;

public interface ListaCompraRepository extends CrudRepository<ListaCompra,Integer> {
	
	List<ListaCompra> findByCliente(Clientes cliente);

}
