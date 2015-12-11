package br.renato.proxy.remote.cliente;

import br.renato.proxy.remote.ServicoStub;
import br.renato.proxy.remote.contrato.ContratoServico;


public class ClienteRemoto {
	
	public static void main(String[] args) {
		
		
		ContratoServico contratoServico = new ServicoStub();
		
		contratoServico.f1();
		
	}
}
