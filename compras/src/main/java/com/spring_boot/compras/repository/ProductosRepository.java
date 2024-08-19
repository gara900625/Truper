package com.spring_boot.compras.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring_boot.compras.entity.Productos;

public interface ProductosRepository extends CrudRepository<Productos, Integer> {

}
