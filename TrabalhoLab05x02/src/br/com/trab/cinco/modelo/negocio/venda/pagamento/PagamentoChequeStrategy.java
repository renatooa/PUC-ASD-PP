package br.com.trab.cinco.modelo.negocio.venda.pagamento;

import br.com.trab.cinco.modelo.negocio.venda.pagamento.proxy.remoto.AutorizadorChequeStub;

/**
 * Estrategia para pagamento com Cheque conformidade ao requisito R08
 * 
 * @author Renato
 *
 */
public class PagamentoChequeStrategy implements PagamentoAutorizavel,
		PagamentoStrategy {

	private double aPagar = 0;

	// Consulta a serviços externos
	private PagamentoAutorizavel pagamentoAutorizavelStub = null;

	public PagamentoChequeStrategy(double aPagar, String carteiraIdentidade) {
		super();
		this.aPagar = aPagar;

		this.pagamentoAutorizavelStub = new AutorizadorChequeStub(
				carteiraIdentidade, aPagar);
	}

	@Override
	public double realizarPagamento(double valorVenda) {
		return aPagar;
	}

	@Override
	public double getValorTroco() {
		return 0;
	}

	@Override
	public boolean verificarPagamento() {
		return pagamentoAutorizavelStub.verificarPagamento();
	}
}
