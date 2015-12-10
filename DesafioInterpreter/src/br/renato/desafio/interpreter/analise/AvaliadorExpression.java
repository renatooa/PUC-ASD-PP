package br.renato.desafio.interpreter.analise;

import br.renato.desafio.interpreter.AcordeExpression;

public class AvaliadorExpression {
	
	private AvaliadorExpression() {
	}
	
	
	public static String interpretar(String expressao) {
		
		AcordeExpression acordeExpression = new AcordeExpression();

		return acordeExpression.interpretar(expressao);
	}

}
