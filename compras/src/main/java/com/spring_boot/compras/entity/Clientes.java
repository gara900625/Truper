package com.spring_boot.compras.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
public class Clientes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idcliente", nullable=false)
	private Integer idCliente;
	
	@Column(name="nombre", nullable=false, length=50)
	private String nombre;
	
	@Column(name="activo")
	private Boolean activo;
	
	@OneToMany(mappedBy = "cliente",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<ListaCompra> listaCompra;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public List<ListaCompra> getListaCompra() {
		return listaCompra;
	}

	public void setListaCompra(List<ListaCompra> listaCompra) {
		this.listaCompra = listaCompra;
	}

}
