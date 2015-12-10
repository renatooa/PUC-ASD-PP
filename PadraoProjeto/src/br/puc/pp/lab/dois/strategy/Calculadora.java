package br.puc.pp.lab.dois.strategy;

import br.puc.pp.lab.dois.strategy.contrato.EstrategiaOperacaoMatematica;

public class Calculadora {

	private EstrategiaOperacaoMatematica contexto;

	public Calculadora() {
	}

	public void setContextoOperacao(EstrategiaOperacaoMatematica contexto) {
		this.contexto = contexto;
	}

	public final double operacao(double operando1, double operando2) {
		return contexto.operacao(operando1, operando2);
	}

	/**
	 * 
	 * @param operacao
	 * @param operando1
	 * @param operando2
	 * @return
	 */
	@Deprecated
	public double soma(String operacao, double operando1, double operando2) {

		if ("+".equals(operacao)) {

			return operando1 + operando2;

		} else if ("-".equals(operacao)) {

			return operando1 - operando2;

		}// ... e continua os testes

		throw new RuntimeException("Nao suportada");
	}
}
