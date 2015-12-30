package br.com.trab.cinco.modelo.negocio.venda.pagamento;

/**
 * Padronização da autorização para pagamento em conformidade com requisitos R07
 * e R08
 * 
 * @author Renato
 *
 */
public interface PagamentoAutorizavel {

	public boolean verificarPagamento();

}
