package br.puc.pp.lab.dois.strategy;


public class Cliente {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();

		calculadora.setContextoOperacao(new StrategiaMultiplicacao());

		double produto = calculadora.operacao(4, 3);
		System.out.println(produto);

		calculadora.setContextoOperacao(new StrategiaSoma());

		double soma = calculadora.operacao(4, 3);
		System.out.println(soma);
	}
}
