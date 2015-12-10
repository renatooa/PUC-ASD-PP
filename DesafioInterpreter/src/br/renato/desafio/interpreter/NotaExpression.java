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
			return "D�";
		} else if (expressao.contains("D")) {
			return "R�";
		} else if (expressao.contains("E")) {
			return "Mi";
		} else if (expressao.contains("F")) {
			return "F�";
		} else if (expressao.contains("G")) {
			return "Sol";
		}

		throw new UnsupportedOperationException("Expressao n�o possui nota");
	}

}
