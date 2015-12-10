package br.renato.desafio.interpreter;

import br.renato.desafio.interpreter.contraro.Expression;

public class BemolExpression implements Expression {

	@Override
	public String interpretar(String expressao) {
		
		if (expressao.contains("b")) {
			return "bemol";
		} 
		
		return "";
	}
}
