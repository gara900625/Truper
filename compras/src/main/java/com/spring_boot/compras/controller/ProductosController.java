package com.spring_boot.compras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot.compras.entity.Productos;
import com.spring_boot.compras.service.ProductosService;

@RestController
@RequestMapping("/productos")
public class ProductosController {
	
	@Autowired
	private ProductosService productosS;
	
	@GetMapping("/listar")
	public List<Productos> obtenerProductos(){
		return productosS.obtenerProductos();
	}
	
	@PostMapping("/guardar")
	public Productos guardarProducto(@RequestBody Productos producto) {
		return productosS.guardarProducto(producto);
	}

}
