package br.renato.strategy;

public class Estrategia_2015 implements EstrategiaCalculoImpostoRenda {

	@Override
	public double calcular(double salario) {

		double ali = 0;
		double decu = 0;

		if (salario >= 1787.78 && salario <= 2679.29) {
			ali = 15;
			decu = 354.80;
		}

		return (((salario) / 100) * ali) - decu;
	}
}
