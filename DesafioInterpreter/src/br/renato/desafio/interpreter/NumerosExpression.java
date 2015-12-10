package br.renato.desafio.interpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.renato.desafio.interpreter.contraro.Expression;

public class NumerosExpression implements Expression {

	private Map<String, String> mapaNumeros = null;

	public NumerosExpression() {

		mapaNumeros = new HashMap<String, String>();

		mapaNumeros.put("1", "primeira");
		mapaNumeros.put("2", "segunda");
		mapaNumeros.put("3", "terceira");
		mapaNumeros.put("4", "quarta");
		mapaNumeros.put("5", "quinta");
		mapaNumeros.put("6", "sexta");
		mapaNumeros.put("7", "sétima");
		mapaNumeros.put("8", "oitava");
		mapaNumeros.put("9", "nona");
	}

	@Override
	public String interpretar(String expressao) {

		Collection<String> ordinais = new ArrayList<String>();

		for (String key : mapaNumeros.keySet()) {

			if (expressao.contains(key)) {
				ordinais.add(mapaNumeros.get(key));
			}
		}

		return interpretarNumeros(ordinais);

	}

	private String interpretarNumeros(Collection<String> ordinais) {

		StringBuilder builder = new StringBuilder();

		for (String string : ordinais) {

			if (builder.length() == 0) {
				builder.append("com ");
			} else {
				builder.append("e ");
			}
			builder.append(string + " ");
		}

		return builder.toString().trim();
	}
}
