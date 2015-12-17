package br.renato.desafio.interpreter;

import br.renato.desafio.interpreter.contraro.Expression;

public class CifrasExpression implements Expression {

	@Override
	public String interpretar(String expressao) {

		String[] cifrastokem = expressao.split(" ");
		StringBuilder builder = new StringBuilder();

		for (String tokem : cifrastokem) {

			AcordeExpression acordeExpression = new AcordeExpression();

			builder.append(acordeExpression.interpretar(tokem.trim()));
			builder.append(System.getProperty("line.separator"));
		}

		return builder.toString();
	}

}