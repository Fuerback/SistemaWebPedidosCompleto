package com.meuspedidos.model.service;

import java.util.List;

import javax.inject.Inject;

import com.meuspedidos.model.Cliente;
import com.meuspedidos.model.dao.ClienteInterface;

public class ClienteService implements ClienteServiceInterface {
	
	@Inject
	private ClienteInterface clienteInterface;

	@Override
	public List<Cliente> getClientes() {
		return clienteInterface.getClientes();
	}

}
