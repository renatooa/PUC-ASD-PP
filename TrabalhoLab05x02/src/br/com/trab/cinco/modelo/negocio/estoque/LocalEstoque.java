package br.com.trab.cinco.modelo.negocio.estoque;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.trab.cinco.modelo.negocio.Produto;

public class LocalEstoque {

	private Collection<EstoqueProduto> estoqueProdutos = null;

	public LocalEstoque() {
		estoqueProdutos = new ArrayList<>();
	}

	public void baixarEstoque(Produto produto, double quantidade) {
		pesquisarEstoqueProdutos(produto).forEach(estoqueProduto -> estoqueProduto.debitarEstoque(quantidade));
	}

	private Stream<EstoqueProduto> pesquisarEstoqueProdutos(Produto produto) {
		return estoqueProdutos.stream().filter(estoqueProduto -> estoqueProduto.getProduto().equals(produto));
	}

	public double contarEstqoueProduto(Produto produto) {
		
		return pesquisarEstoqueProdutos(produto)
				.collect(Collectors.summarizingDouble(estoqueProduto -> estoqueProduto.getQuantidadeEstoque()))
				.getSum();
	}
}
