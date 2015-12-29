package br.com.trab.cinco.modelo.negocio.venda.pagamento;

import br.com.trab.cinco.modelo.negocio.venda.pagamento.proxy.remoto.AutorizadorChequeStub;

public class PagamentoChequeStrategy implements PagamentoAutorizavel, PagamentoStrategy {

	private double aPagar = 0;
	
	private PagamentoAutorizavel pagamentoAutorizavelStub = null;

	public PagamentoChequeStrategy(double aPagar, String carteiraIdentidade) {
		super();
		this.aPagar = aPagar;

		this.pagamentoAutorizavelStub = new AutorizadorChequeStub(carteiraIdentidade, aPagar);
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
