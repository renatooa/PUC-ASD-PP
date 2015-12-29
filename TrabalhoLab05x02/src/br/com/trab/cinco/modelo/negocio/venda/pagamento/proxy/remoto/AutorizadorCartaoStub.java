package br.com.trab.cinco.modelo.negocio.venda.pagamento.proxy.remoto;

import br.com.trab.cinco.modelo.negocio.venda.pagamento.CartaoInfoDTO;
import br.com.trab.cinco.modelo.negocio.venda.pagamento.PagamentoAutorizavel;

public class AutorizadorCartaoStub implements PagamentoAutorizavel {

	private CartaoInfoDTO cartaoInfo = null;
	private double aPagar = 0;
	// private AutorizadorCartaoSkeleton autorizadorCartaoSkeleton

	@Override
	public boolean verificarPagamento() {
		// Utiliza o PagamentoAutorizavel Skeleton para verificar externamento o
		// a autorização para o pagamento com cartão de credito
		return cartaoInfo != null;
	}

	public AutorizadorCartaoStub(CartaoInfoDTO cartaoInfo, double aPagar) {
		super();
		this.cartaoInfo = cartaoInfo;
		this.aPagar = aPagar;
	}

	public CartaoInfoDTO getCartaoInfo() {
		return cartaoInfo;
	}

	public void setCartaoInfo(CartaoInfoDTO cartaoInfo) {
		this.cartaoInfo = cartaoInfo;
	}

	public double getaPagar() {
		return aPagar;
	}

	public void setaPagar(double aPagar) {
		this.aPagar = aPagar;
	}
}
