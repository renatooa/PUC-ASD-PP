package br.com.trab.cinco.modelo.negocio;

/**
 * Produtos unicos para todas as filiais </br> Conforme requisito R11
 * 
 * @author Renato
 *
 */
public class Produto {

	private String nome = null;
	private double preco = 0;

	public Produto() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "nome=" + nome + " preco =" + preco;
	}
}
