package br.renato.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.renato.composite.OperandoSubtracao;
import br.renato.composite.contrato.Operacionavel;

/**
 * 
 * @author Renato
 *
 */
public class OperandoSubtracaoProxy implements Operacionavel {

	private static Logger log = LogManager
			.getLogger(OperandoSubtracaoProxy.class);

	private OperandoSubtracao operandoSubtracao = null;

	public OperandoSubtracaoProxy(Operacionavel operando1,
			Operacionavel operando2) {
		operandoSubtracao = new OperandoSubtracao(operando1, operando2);
	}

	@Override
	public int getNumero() {

		int subtracao = operandoSubtracao.getNumero();

		log.info("-= " + subtracao);

		return subtracao;
	}
}
