package br.renato.strategy;

import br.renato.strategy.contrato.EstrategiaCalculoImpostoRenda;

public class CalculadoraIR {

	private EstrategiaCalculoImpostoRenda contexto = null;

	public CalculadoraIR() {
	}

	public final double calcularIR(double salario) {
		
		return contexto.calcular(salario);
	}

	public void setContexto(EstrategiaCalculoImpostoRenda contexto) {
		this.contexto = contexto;
	}
}
