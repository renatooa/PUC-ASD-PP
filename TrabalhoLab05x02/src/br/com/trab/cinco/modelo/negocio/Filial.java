package br.com.trab.cinco.modelo.negocio;

import br.com.trab.cinco.modelo.negocio.estoque.LocalEstoque;

/**
 * Representação da loja na qual contem o {@link LocalEstoque local de estoque}
 * </br> Conforme requisito R11
 * 
 * @author Renato
 *
 */
public class Filial {

	private String nome = null;
	private LocalEstoque localEstoque = null;

	public Filial() {
	}

	public Filial(LocalEstoque localEstoque) {
		super();
		this.localEstoque = localEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalEstoque getLocalEstoque() {
		return localEstoque;
	}

	public void setLocalEstoque(LocalEstoque localEstoque) {
		this.localEstoque = localEstoque;
	}

	/**
	 * Baixa o estoque pertencente a filial atravéz do {@link LocalEstoque local
	 * de estoque}</br> Conforme o requisito R11
	 * 
	 * @param produto
	 * @param quantidade
	 */
	public void baixarEstoque(Produto produto, double quantidade) {
		localEstoque.baixarEstoque(produto, quantidade);
	}

	public double consutarEstoque(Produto produto) {
		return localEstoque.contarEstqoueProduto(produto);
	}
}
