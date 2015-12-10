package br.puc.pp.proxy.remote;

import br.puc.pp.proxy.ContratoServico;

public class ClienteRemoto {
	
	public static void main(String[] args) {
		
		
		ContratoServico contratoServico = new ServicoStub();
		
		contratoServico.f1();
		
	}
}
