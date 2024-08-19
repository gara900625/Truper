package com.spring_boot.compras.service;

import java.util.List;

import com.spring_boot.compras.entity.Productos;

public interface ProductosService {
	
	public List<Productos> obtenerProductos();
	public Productos guardarProducto(Productos producto);

}
