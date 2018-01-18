package com.meuspedidos.model.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.meuspedidos.model.Cliente;
import com.meuspedidos.model.service.ClienteServiceInterface;

@Path("/clientes")
@Produces({MediaType.APPLICATION_JSON,
	MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class ClienteFacade {
	
	@Inject
	private ClienteServiceInterface clienteServiceInterface;
	
	@GET
	public List<Cliente> getClientes() {
		return clienteServiceInterface.getClientes();
	}

}
