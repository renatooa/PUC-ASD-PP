package br.renato.proxy.remote;

import br.renato.proxy.remote.contrato.ContratoServico;


public class ServicoSkeleton implements ContratoServico {

	Servico servico = null;

	public ServicoSkeleton() {

		servico = new Servico();

	}

	@Override
	public void f1() {
		System.out.println("Skeleton F1");
		servico.f1();
	}

	@Override
	public void f2() {
		System.out.println("Skeleton F2");
		servico.f2();
	}

	@Override
	public void f3() {
		System.out.println("Skeleton F3");
		servico.f3();
	}
}
