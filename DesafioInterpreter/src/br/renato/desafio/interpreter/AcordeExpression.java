package br.renato.desafio.interpreter;

import java.util.ArrayList;
import java.util.List;

import br.renato.desafio.interpreter.contraro.Expression;

public class AcordeExpression implements Expression {

	private List<Expression> expressions;

	public AcordeExpression() {
		expressions = new ArrayList<Expression>();

		expressions.add(new NotaExpression());
		expressions.add(new BemolExpression());
		expressions.add(new SustenidoExpression());
		expressions.add(new DiminutoExpression());
		expressions.add(new NumerosExpression());
		expressions.add(new AcordeMaiorExpression());
		expressions.add(new AcordeMenorExpression());

	}

	@Override
	public String interpretar(String expressao) {

		StringBuilder stringBuilder = new StringBuilder();

		for (Expression expression : expressions) {

			String result = expression.interpretar(expressao);

			if (result != null && !result.isEmpty()) {
				
				stringBuilder.append(result);
				stringBuilder.append(" ");
				
			}
		}

		return stringBuilder.toString().trim();
	}
}
