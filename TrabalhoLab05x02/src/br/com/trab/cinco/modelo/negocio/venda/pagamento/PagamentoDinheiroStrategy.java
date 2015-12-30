package br.com.trab.cinco.modelo.negocio.venda.pagamento;

/**
 * Estratagia para pagamento em Dinheiro conforme requisito R06
 * 
 * @author Renato
 *
 */
public class PagamentoDinheiroStrategy implements PagamentoStrategy {

	private double troco = 0;
	private double aPagar = 0;

	public PagamentoDinheiroStrategy(double aPagar) {
		super();
		this.aPagar = aPagar;
	}

	@Override
	public double realizarPagamento(double valorVenda) {
		troco = aPagar - valorVenda;
		return aPagar;
	}

	@Override
	public double getValorTroco() {
		return troco;
	}
}
