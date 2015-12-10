package br.renato.composite;

import java.util.ArrayList;
import java.util.List;

import br.renato.composite.contrato.Operacionavel;
/**
 * 
 * @author Renato
 *
 */
public abstract class OperandoOperacao implements Operacionavel {

	protected List<Operacionavel> operandos = null;

	private OperandoOperacao() {
		operandos = new ArrayList<Operacionavel>();
	}

	protected OperandoOperacao(Operacionavel operando1,
			Operacionavel operando2) {
		this();
		operandos.add(operando1);
		operandos.add(operando2);
	}
	
	public List<Operacionavel> getOperandos() {
		return operandos;
	}
}
