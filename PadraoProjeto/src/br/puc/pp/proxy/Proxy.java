package br.puc.pp.proxy;

/**
 * https://en.wikipedia.org/wiki/Proxy_pattern#C.23
 * 
 * @author 62241
 *
 */
public class Proxy implements ContratoServico {

	private Servico servico;
	
	
	public Proxy() {
		servico = new Servico();
	}

	@Override
	public void f1() {
		
		// Faça algo aki auditoria
		System.out.println("Prox Antes");
		servico.f1(); // Delegação
		System.out.println("Prox Depois");

	}

	@Override
	public void f2() {

		// Faça algo aki auditoria
		System.out.println("Prox Antes");
		servico.f2(); // Delegação
		System.out.println("Prox Depois");
	}

	@Override
	public void f3() {

		// Faça algo aki auditoria
		System.out.println("Prox Antes");
		servico.f3(); // Delegação
		System.out.println("Prox Depois");
	}
}