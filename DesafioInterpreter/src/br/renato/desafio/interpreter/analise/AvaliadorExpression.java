package br.renato.desafio.interpreter.analise;

import br.renato.desafio.interpreter.AcordeExpression;
import br.renato.desafio.interpreter.CifrasExpression;

public class AvaliadorExpression {
	
	private AvaliadorExpression() {
	}
	
	public static void verificarExpressao(String expressao) {

		String regex = "[A|B|C|D|E|F|G]|[0-9]|[#|°]|[m|b|+|/]|[\\s]";

		String resultante = expressao.replaceAll(regex, "");

		if (resultante.length() > 0) {

			throw new UnsupportedOperationException(
					"Expressão invalida! Caracteres não suportados ="
							+ resultante);
		}
	}
	
	public static String interpretar(String expressao) {
		
		verificarExpressao(expressao);
		
		AcordeExpression acordeExpression = new AcordeExpression();
		
		return acordeExpression.interpretar(expressao);
	}
	
	public static String interpretarCifra(String expressao) {
		verificarExpressao(expressao);
		CifrasExpression cifras = new CifrasExpression();
		
		return cifras.interpretar(expressao);
	}
}
