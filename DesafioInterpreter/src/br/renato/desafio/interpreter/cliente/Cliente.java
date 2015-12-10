package br.renato.desafio.interpreter.cliente;

import br.renato.desafio.interpreter.analise.AvaliadorExpression;

public class Cliente {
	
	public static void main(String[] args) {
		
		AvaliadorExpression avaliadorExpression = new AvaliadorExpression();
		
		System.err.println(avaliadorExpression.interpretar("Db"));
	}

}
