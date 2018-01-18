package com.meuspedidos.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
@Table(name="item")
public class Item implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="itemCodigo")
	private Integer codigo;
	@Column(name="itemProduto", nullable=false)
	private String produto;
	@Column(name="itemQuantidade", nullable=false)
	private Integer quantidade;
	@Column(name="itemPreco", nullable=false)
	private BigDecimal preco;
	@Column(name="itemMultiplo", nullable=true)
	private Integer multiplo;
	
	@OneToMany(mappedBy="item")
	private List<Pedido> pedido;
	
	@XmlTransient
	public List<Pedido> getPedidos() {
		return pedido;
	}
	
//	public List<Pedido> getPedidos() {
//		return pedido;
//	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

	public Item() {
		
	}
	
	public Item(Integer codigo, String produto, Integer quantidade, BigDecimal preco, Integer multiplo) {
		this.codigo = codigo;
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
		this.multiplo = multiplo;
	}	
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}
