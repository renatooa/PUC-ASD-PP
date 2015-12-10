package br.renato.strategy;

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
