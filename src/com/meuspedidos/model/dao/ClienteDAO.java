package com.meuspedidos.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.meuspedidos.model.Cliente;

public class ClienteDAO implements ClienteInterface {
	
	@PersistenceContext(unitName="MeusPedidos")
	private EntityManager entityManager;

	@Override
	@SuppressWarnings("unchecked")
	public List<Cliente> getClientes() {
		Query query = entityManager.createQuery("from Cliente");
		return query.getResultList();
	}

}
