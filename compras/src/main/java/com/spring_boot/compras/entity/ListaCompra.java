package com.spring_boot.compras.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="listacompra")
public class ListaCompra {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idlista", nullable=false)
	private Integer idLista;
	
	@Column(name="nombre", nullable=false, length=50)
	private String nombre;
	
	@Column(name="fecha_registro")
	private Date fechaRegistro;
	
	@Column(name="fecha_ultima_actualizacion")
	private Date fechaUltimaActualizacion;
	
	@Column(name="activo")
	private Boolean activo;
	
	@OneToMany(
	        mappedBy = "listaCompra",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	private List<ListaCompraDetalle> listaCompraDetalle;
	
	@ManyToOne
	@JoinColumn(name="idcliente")
	private Clientes cliente;

	public Integer getIdLista() {
		return idLista;
	}

	public void setIdLista(Integer idLista) {
		this.idLista = idLista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaUltimaActualizacion() {
		return fechaUltimaActualizacion;
	}

	public void setFechaUltimaActualizacion(Date fechaUltimaActualizacion) {
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public List<ListaCompraDetalle> getListaCompraDetalle() {
		return listaCompraDetalle;
	}

	public void setListaCompraDetalle(List<ListaCompraDetalle> listaCompraDetalle) {
		this.listaCompraDetalle = listaCompraDetalle;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

}
