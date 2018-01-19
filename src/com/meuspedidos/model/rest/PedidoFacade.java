package com.meuspedidos.model.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.meuspedidos.model.Pedido;
import com.meuspedidos.model.service.PedidoServiceInterface;


@Path("/pedidos")
@Produces({MediaType.APPLICATION_JSON,
		MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class PedidoFacade {

	@Inject
	private PedidoServiceInterface pedidoServiceInterface;
	
	@GET
	public List<Pedido> getPedidos() {
		return pedidoServiceInterface.getPedidos();
	}
	
	@POST
	public Pedido salvarPedido(Pedido pedido) {
		return pedidoServiceInterface.salvarPedido(pedido);
	}
	
	@PUT
	public void alterarPedido(Pedido pedido) {
		System.out.println("PUT alterarPedido");
		pedidoServiceInterface.alterarPedido(pedido);
	}	 
}
