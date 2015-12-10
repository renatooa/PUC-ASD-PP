package br.renato.adapter;

import br.renato.composite.OperandoOperacao;
import br.renato.composite.contrato.Operacionavel;

/**
 * 
 * @author Renato
 *
 */
public class OperandoOperacaoAdapter {

	private OperandoOperacao operacao = null;

	public OperandoOperacaoAdapter(OperandoOperacao operacao) {
		this.operacao = operacao;
	}

	public Operacionavel getOperacionavel1() {
		return operacao.getOperandos().get(0);
	}

	public Operacionavel getOperacionavel2() {
		return operacao.getOperandos().get(1);
	}
}
