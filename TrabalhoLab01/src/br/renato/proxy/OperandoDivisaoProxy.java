package br.renato.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.renato.composite.OperandoDivisao;
import br.renato.composite.contrato.Operacionavel;
/**
 * 
 * @author Renato
 *
 */
public class OperandoDivisaoProxy implements Operacionavel {

	private static Logger log = LogManager
			.getLogger(OperandoDivisaoProxy.class);

	private OperandoDivisao operandoDivisao = null;

	public OperandoDivisaoProxy(Operacionavel operando1, Operacionavel operando2) {
		operandoDivisao = new OperandoDivisao(operando1, operando2);
	}

	@Override
	public int getNumero() {

		int quociente = operandoDivisao.getNumero();

		log.info("/= " + quociente);

		return quociente;
	}

}
