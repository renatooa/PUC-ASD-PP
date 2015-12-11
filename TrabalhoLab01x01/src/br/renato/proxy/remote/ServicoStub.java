package br.renato.proxy.remote;

import br.renato.proxy.remote.contrato.ContratoServico;


public class ServicoStub implements ContratoServico {

	private ServicoSkeleton servicoSkeleton = null;

	public ServicoStub() {

		servicoSkeleton = new ServicoSkeleton();
	}

	@Override
	public void f1() {
		
		System.out.println("Stub F1");
		servicoSkeleton.f1();

	}

	@Override
	public void f2() {
		System.out.println("Stub F2");
		servicoSkeleton.f2();

	}

	@Override
	public void f3() {
		System.out.println("Stub F3");
		servicoSkeleton.f3();

	}

}
