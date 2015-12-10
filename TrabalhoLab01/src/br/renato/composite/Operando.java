package br.renato.composite;

import br.renato.composite.contrato.Operacionavel;
/**
 * 
 * @author Renato
 *
 */
public class Operando implements Operacionavel {

	public int numero = 0;

	public Operando() {
	}

	public Operando(int numero) {
		this();
		this.numero = numero;
	}

	@Override
	public int getNumero() {
		return numero;
	}
}
