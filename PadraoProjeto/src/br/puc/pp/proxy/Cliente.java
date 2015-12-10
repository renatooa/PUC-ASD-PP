package br.puc.pp.proxy;

/**
 * https://en.wikipedia.org/wiki/Proxy_pattern#C.23
 * 
 * @author 62241
 *
 */
public class Cliente {

	public static void main(String[] args) {

		ContratoServico servico = new Proxy();

		servico.f1();
	}
}
