package br.com.trab.cinco.modelo.venda.pagamento;

public interface PagamentoStrategy {
	
	public double realizarPagamento(double valorVenda);
	
	public double getValorTroco();

}
