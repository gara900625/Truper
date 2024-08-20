package com.spring_boot.compras.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring_boot.compras.entity.ListaCompraDetalle;
import com.spring_boot.compras.entity.ListaCompraDetalleId;

public interface ListaCompraDetalleRepository extends CrudRepository<ListaCompraDetalle,ListaCompraDetalleId> {

}
