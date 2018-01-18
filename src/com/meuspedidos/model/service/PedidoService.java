package com.meuspedidos.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.meuspedidos.model.Pedido;
import com.meuspedidos.model.dao.PedidoInterface;

public class PedidoService implements PedidoServiceInterface {
	
	@Inject
	private PedidoInterface pedidoInterface; 

	@Override
	@Transactional
	public Pedido salvarPedido(Pedido pedido) {
		return pedidoInterface.salvarPedido(pedido);
	}

	@Override
	@Transactional
	public void alterarPedido(Pedido pedido) {
		pedidoInterface.alterarPedido(pedido);
	}

	@Override
	public List<Pedido> getPedidos() {
		return pedidoInterface.getPedidos();
	}

}
