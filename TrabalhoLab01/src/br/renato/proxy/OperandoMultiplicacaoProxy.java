package br.renato.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.renato.composite.OperandoMultiplicacao;
import br.renato.composite.contrato.Operacionavel;
/**
 * 
 * @author Renato
 *
 */
public class OperandoMultiplicacaoProxy implements Operacionavel {

	private static Logger log = LogManager
			.getLogger(OperandoMultiplicacaoProxy.class);

	private OperandoMultiplicacao operandoMultiplicacao = null;

	public OperandoMultiplicacaoProxy(Operacionavel operando1,
			Operacionavel operando2) {
		
		operandoMultiplicacao = new OperandoMultiplicacao(operando1, operando2);
	}

	@Override
	public int getNumero() {

		int produto = operandoMultiplicacao.getNumero();
		log.info("*= " + produto);

		return produto;
	}

}
