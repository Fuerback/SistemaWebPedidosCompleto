package com.meuspedidos.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.meuspedidos.model.Item;

public class ItemDAO implements ItemInterface {
	
	@PersistenceContext(unitName="MeusPedidos")
	private EntityManager entityManager;

	@Override
	@SuppressWarnings("unchecked")
	public List<Item> getItens() {
		Query query = entityManager.createQuery("from Item");
		return query.getResultList();
	}

}
