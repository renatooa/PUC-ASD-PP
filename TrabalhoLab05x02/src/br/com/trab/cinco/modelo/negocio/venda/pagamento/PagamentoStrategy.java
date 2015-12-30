package br.com.trab.cinco.modelo.negocio.venda.pagamento;

/**
 * Estrategias para pagamento conforme requisitos de R06 a R08
 * 
 * @author Renato
 *
 */
public interface PagamentoStrategy {

	public double realizarPagamento(double valorVenda);

	public double getValorTroco();

}
