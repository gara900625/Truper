package com.spring_boot.compras.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring_boot.compras.entity.Clientes;

public interface ClientesRepository extends CrudRepository<Clientes, Integer> {

}
