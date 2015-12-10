package br.renato.strategy.base;

import br.renato.strategy.contrato.EstrategiaCalculoImpostoRenda;

public class EstrategiaBase implements EstrategiaCalculoImpostoRenda {

	private double salarioInicial = 0;
	private double salarioFinal = 0;
	private double aliquota = 0;

	public EstrategiaBase() {
	}

	public EstrategiaBase(double salarioInicial, double salarioFinal,
			double aliquota) {
		super();
		this.salarioInicial = salarioInicial;
		this.salarioFinal = salarioFinal;
		this.aliquota = aliquota;
	}

	@Override
	public double calcular(double salario) {

		double valorCalculoFaixa = 0;

		if (salario <= salarioInicial) {
			return 0;
		}

		if (salario > salarioFinal && salarioFinal != salarioInicial) {

			valorCalculoFaixa = getSalarioDelta();

		} else {
			valorCalculoFaixa = salario - salarioInicial;
		}

		return valorCalculoFaixa * (aliquota / 100);
	}

	private double getSalarioDelta() {
		return salarioFinal - salarioInicial;
	}

	public double getSalarioFinal() {
		return salarioFinal;
	}

	public void setSalarioFinal(double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}

	public double getSalarioInicial() {
		return salarioInicial;
	}

	public void setSalarioInicial(double salarioInicial) {
		this.salarioInicial = salarioInicial;
	}
}
