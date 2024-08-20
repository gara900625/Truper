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
@Table(name="productos")
public class Productos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idproducto", nullable=false)
	private Integer idProducto;
	
	@Column(name="clave", length=50)
	private String clave;
	
	@Column(name="descripcion", length=150)
	private String descripcion;
	
	@Column(name="activo")
	private Boolean activo;
	
	@OneToMany(
	        mappedBy = "productos",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	private List<ListaCompraDetalle> listaCompraDetalle;

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

}
