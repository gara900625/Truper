package com.spring_boot.compras.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring_boot.compras.entity.ListaCompraDetalle;

public interface ListaCompraDetalleRepository extends CrudRepository<ListaCompraDetalle,Integer> {
	
	@Query("SELECT L.* from ListaCompraDetalle as L "
			+ "left union ListaCompra as LC on L.idListaCompra = LC.idlista "
			+ "left union Clientes as C on LC.customer_id = C.id_cliente"
			+ "where C.id_cliente = ?1")
	List<ListaCompraDetalle> findByIdCliente(Integer idCliente); 
	
	ListaCompraDetalle findByidListaCompraAndidCodigoProducto(Integer idListaCompra, Integer idCodigoProducto);

}
