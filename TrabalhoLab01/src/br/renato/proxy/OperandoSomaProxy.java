package br.renato.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.renato.composite.OperandoSoma;
import br.renato.composite.contrato.Operacionavel;
/**
 * 
 * @author Renato
 *
 */
public class OperandoSomaProxy implements Operacionavel {

	private static Logger log = LogManager.getLogger(OperandoSomaProxy.class);
	private OperandoSoma operandoSoma = null;

	public OperandoSomaProxy(Operacionavel operando1, Operacionavel operando2) {
		operandoSoma = new OperandoSoma(operando1, operando2);
	}

	@Override
	public int getNumero() {

		int soma = operandoSoma.getNumero();


		log.info("+= " + soma);

		return soma;
	}
}
