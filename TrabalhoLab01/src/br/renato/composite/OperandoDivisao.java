package br.renato.composite;

import br.renato.composite.contrato.Operacionavel;
/**
 * 
 * @author Renato
 *
 */
public class OperandoDivisao extends OperandoOperacao {

	public OperandoDivisao(Operacionavel operando1, Operacionavel operando2) {
		super(operando1, operando2);
	}

	@Override
	public int getNumero() {
		return operandos.get(0).getNumero() / operandos.get(1).getNumero();
	}
}
