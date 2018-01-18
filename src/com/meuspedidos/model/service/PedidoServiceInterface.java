package com.meuspedidos.model.service;

import java.util.List;

import com.meuspedidos.model.Pedido;

public interface PedidoServiceInterface {
	
	public Pedido salvarPedido(Pedido pedido);
	
	public void alterarPedido(Pedido pedido);
	
	public List<Pedido> getPedidos();
}
