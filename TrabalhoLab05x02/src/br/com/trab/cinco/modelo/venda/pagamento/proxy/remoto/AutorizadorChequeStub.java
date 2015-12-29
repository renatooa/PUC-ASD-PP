package br.com.trab.cinco.modelo.venda.pagamento.proxy.remoto;

import br.com.trab.cinco.modelo.venda.pagamento.PagamentoAutorizavel;

public class AutorizadorChequeStub implements PagamentoAutorizavel {

	private String carteiraIdentidade = null;
	private double aPagar = 0;
	// private AutorizadorChequeSkeleton autorizadorChequeSkeleton

	public AutorizadorChequeStub(String carteiraIdentidade, double aPagar) {
		super();
		this.carteiraIdentidade = carteiraIdentidade;
		this.aPagar = aPagar;
	}

	@Override
	public boolean verificarPagamento() {
		// Utiliza o PagamentoAutorizavel Skeleton para verificar externamento o
		// a autoriza��o para o cheque
		return carteiraIdentidade != null && aPagar > 0;
	}
}
