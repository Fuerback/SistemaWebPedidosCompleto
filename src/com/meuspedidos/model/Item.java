package com.meuspedidos.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String produto;
	private Integer quantidade;
	private Double preco;
	private Integer multiplo;
	
	public Item() {
		
	}
	
	public Item(String produto, Integer quantidade, Double preco, Integer multiplo) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
		this.multiplo = multiplo;
	}	
	
	public Integer getMultiplo() {
		return multiplo;
	}

	public void setMultiplo(Integer multiplo) {
		this.multiplo = multiplo;
	}

	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
