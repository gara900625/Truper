package com.spring_boot.compras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot.compras.entity.Productos;
import com.spring_boot.compras.repository.ProductosRepository;

@Service
public class ProductosServiceImpl implements ProductosService {
	
	@Autowired
	private ProductosRepository productosR;

	@Override
	public List<Productos> obtenerProductos() {
		return (List<Productos>) productosR.findAll();
	}

	@Override
	public Productos guardarProducto(Productos producto) {
		return productosR.save(producto);
	}

}
