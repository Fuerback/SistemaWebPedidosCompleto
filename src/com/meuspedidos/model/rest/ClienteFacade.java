package com.meuspedidos.model.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.meuspedidos.model.Cliente;
import com.meuspedidos.model.service.ClienteServiceInterface;

@Path("/clientes")
@Produces({MediaType.APPLICATION_JSON,
	MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class ClienteFacade {
	
	@Inject
	private ClienteServiceInterface clienteServiceInterface;
	
	@OPTIONS
	public Response getOptions() {
		return Response.ok()
			.header("Access-Control-Allow-Origin", "*")
			.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
			.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").build();
	}
	
	@GET
	public List<Cliente> getClientes() {
		return clienteServiceInterface.getClientes();
	}

}
