package br.renato.desafio.interpreter.cliente;

import br.renato.desafio.interpreter.analise.AvaliadorExpression;

public class Cliente {

	public static void main(String[] args) {

		System.out.println(AvaliadorExpression.interpretarCifra("D6/9° C7 Dm7"));
		
		System.out.println(AvaliadorExpression.interpretarCifra("E6/9° C7 Dm7 Rm"));
	}
}
