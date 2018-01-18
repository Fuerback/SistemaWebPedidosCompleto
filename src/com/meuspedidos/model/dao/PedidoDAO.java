package com.meuspedidos.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.meuspedidos.model.Pedido;

public class PedidoDAO implements PedidoInterface {
	
	@PersistenceContext(unitName="MeusPedidos")
	private EntityManager entityManager;

	@Override
	public Pedido salvarPedido(Pedido pedido) {
		entityManager.merge(pedido);
		return pedido;
	}

	@Override
	public void alterarPedido(Pedido pedido) {
		Pedido pedidoMerge = entityManager.merge(pedido);
		entityManager.persist(pedidoMerge);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Pedido> getPedidos() {
		Query query = entityManager.createQuery("from Pedido");
		return query.getResultList();
	}

}
