package com.meuspedidos.model.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.meuspedidos.model.Cliente;

@Path("/clientes")
@Produces({MediaType.APPLICATION_JSON,
	MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class ClienteFacede {
	
	private static List<Cliente> listaClientes = new ArrayList<Cliente>();
	
	static {
		listaClientes.add(new Cliente("Darth Vader"));
		listaClientes.add(new Cliente("Obi-Wan Kenobi"));
		listaClientes.add(new Cliente("Luke Skywalker"));
		listaClientes.add(new Cliente("Imperador Palpatine"));
		listaClientes.add(new Cliente("Han Solo"));
	}
	
	@GET
	public List<Cliente> getClientes(){
		return listaClientes;
	}

}
