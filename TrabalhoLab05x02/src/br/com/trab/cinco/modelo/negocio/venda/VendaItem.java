package br.com.trab.cinco.modelo.negocio.venda;

import br.com.trab.cinco.modelo.negocio.Produto;

public class VendaItem {

	private double quantidade = 0;
	private Produto produto = null;

	public VendaItem(Produto produto, double quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public double getValor() {
		return quantidade * produto.getPreco();
	}

	public String getDescricao() {
		return produto.toString() + " quant " + quantidade;
	}
	
	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
