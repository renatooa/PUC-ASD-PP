package br.renato.desafio.interpreter;

import br.renato.desafio.interpreter.contraro.Expression;

public class NotaExpression implements Expression {

	@Override
	public String interpretar(String expressao) {

		if (expressao.contains("A")) {
			return "La";
		} else if (expressao.contains("B")) {
			return "Si";
		} else if (expressao.contains("C")) {
			return "Dó";
		} else if (expressao.contains("D")) {
			return "Ré";
		} else if (expressao.contains("E")) {
			return "Mi";
		} else if (expressao.contains("F")) {
			return "Fá";
		} else if (expressao.contains("G")) {
			return "Sol";
		}

		throw new UnsupportedOperationException("Expressao não possui nota");
	}

}
