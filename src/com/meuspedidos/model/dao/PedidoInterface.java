package com.meuspedidos.model.dao;

import java.util.List;

import com.meuspedidos.model.Pedido;

public interface PedidoInterface {
	
	public Pedido salvarPedido(Pedido pedido);
	
	public void alterarPedido(Pedido pedido);
	
	public List<Pedido> getPedidos();
	
}
