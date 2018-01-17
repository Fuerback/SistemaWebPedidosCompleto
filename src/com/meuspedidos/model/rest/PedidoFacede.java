package com.meuspedidos.model.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.meuspedidos.model.Cliente;
import com.meuspedidos.model.Item;
import com.meuspedidos.model.Pedido;


@Path("/pedidos")
@Produces({MediaType.APPLICATION_JSON,
		MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class PedidoFacede {

	private static List<Pedido> listaPedidos = new ArrayList<Pedido>();
	
	static {
		listaPedidos.add(new Pedido(new Cliente("Luke Skywalker"), new Item("Millenium Falcon", 0, 550.000, 1)));
	}
	
	@GET
	public List<Pedido> getPedidos(){
		return listaPedidos;
	}
	
	@POST
	public Pedido salvarPedido(Pedido pedido) {
		listaPedidos.add(pedido);
		return pedido;
	}
	
	@PUT
	public void atualizarPedido(Pedido pedido) {
		listaPedidos.remove(pedido);
		listaPedidos.add(pedido);
	}
}
