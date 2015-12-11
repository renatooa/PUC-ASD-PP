package br.renato.proxy.remote;

import br.renato.proxy.remote.contrato.ContratoServico;

public class Servico implements ContratoServico {

	public void f1() {
		System.out.println("Servico F1");
	}

	public void f2() {
		System.out.println("Servico F2");
	}

	public void f3() {
		System.out.println("Servico F3");
	}
}
