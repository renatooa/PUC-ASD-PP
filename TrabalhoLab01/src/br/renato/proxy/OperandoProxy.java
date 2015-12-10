package br.renato.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.renato.composite.Operando;
import br.renato.composite.contrato.Operacionavel;
/**
 * 
 * @author Renato
 *
 */
public class OperandoProxy implements Operacionavel {

	private static Logger log = LogManager.getLogger(OperandoProxy.class);

	Operando operando = null;

	public OperandoProxy(int numero) {
		operando = new Operando(numero);
	}

	@Override
	public int getNumero() {

		int numero = operando.getNumero();

		log.info("= "+ numero);

		return numero;
	}
}
