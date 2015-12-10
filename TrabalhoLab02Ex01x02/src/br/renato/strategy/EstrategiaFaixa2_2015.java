package br.renato.strategy;

public class EstrategiaFaixa2_2015 implements EstrategiaCalculoImpostoRenda {

	private double deducao = 354.80;
	private double aliquota = 15;

	public EstrategiaFaixa2_2015() {
	}

	@Override
	public double calcular(double salaario) {
		return (((salaario) / 100) * aliquota) - deducao;
	}
}
