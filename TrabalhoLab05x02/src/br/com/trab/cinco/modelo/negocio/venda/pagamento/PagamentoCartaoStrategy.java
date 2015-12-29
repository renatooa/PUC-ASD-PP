package br.com.trab.cinco.modelo.negocio.venda.pagamento;

import br.com.trab.cinco.modelo.negocio.venda.pagamento.proxy.remoto.AutorizadorCartaoStub;

public class PagamentoCartaoStrategy implements PagamentoAutorizavel, PagamentoStrategy {

	private double aPagar = 0;

	private PagamentoAutorizavel pagamentoAutorizavelStub = null;

	public PagamentoCartaoStrategy(double aPagar) {

		this.aPagar = aPagar;

		pagamentoAutorizavelStub = new AutorizadorCartaoStub(capturarDadosCartao(), aPagar);
	}

	private CartaoInfoDTO capturarDadosCartao() {
		// Lendo Pinpad
		return new CartaoInfoDTO("9812831");
	}

	@Override
	public double realizarPagamento(double valorVenda) {
		return 0;
	}

	@Override
	public double getValorTroco() {
		return aPagar;
	}

	@Override
	public boolean verificarPagamento() {
		return pagamentoAutorizavelStub.verificarPagamento();
	}

}
