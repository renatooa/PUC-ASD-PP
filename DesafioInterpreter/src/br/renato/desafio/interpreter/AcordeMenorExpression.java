package br.renato.desafio.interpreter;

import br.renato.desafio.interpreter.contraro.Expression;

public class AcordeMenorExpression implements Expression {

	@Override
	public String interpretar(String expressao) {

		if (expressao.contains("m")) {
			return "menor";
		}

		return "";
	}
}
