package br.renato.strategy;

public class EstrategiaFaixa1_2015 implements EstrategiaCalculoImpostoRenda {

	private double deducao = 142.8;
	private double aliquota = 7.5;

	@Override
	public double calcular(double salaario) {
		return (((salaario) / 100) * aliquota) - deducao;
	}
}
