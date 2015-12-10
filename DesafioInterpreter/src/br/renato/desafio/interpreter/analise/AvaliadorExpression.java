package br.renato.desafio.interpreter.analise;

import br.renato.desafio.interpreter.AcordeExpression;
import br.renato.desafio.interpreter.contraro.Expression;

public class AvaliadorExpression implements Expression {
	
	
	
	

	@Override
	public String interpretar(String expressao) {
		
		AcordeExpression acordeExpression = new AcordeExpression();

		return acordeExpression.interpretar(expressao);
	}

}
