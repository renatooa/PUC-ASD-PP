package br.com.trab.cinco.modelo.negocio.estoque;

import br.com.trab.cinco.modelo.negocio.Produto;

public class EstoqueProduto {

	private Produto produto;

	private double quantidadeEstoque = 0;

	public EstoqueProduto() {
	}

	public void debitarEstoque(double quantidade) {
		quantidadeEstoque -= quantidade;
	}

	public void creditarEstoque(double quantidade) {
		quantidadeEstoque += quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(double quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
}
