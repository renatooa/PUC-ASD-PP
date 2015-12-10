package br.renato.desafio.interpreter;

import br.renato.desafio.interpreter.contraro.Expression;

public class SustenidoExpression implements Expression {

	@Override
	public String interpretar(String expressao) {

		if (expressao.contains("#")) {
			return "Sustenido";
		}

		return "";
	}

}
