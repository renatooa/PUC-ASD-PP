package br.renato.strategy;

public class Cliente {

	public static void main(String[] args) {
		
		
		CalculadoraIR calculadoraIR = new CalculadoraIR();
		
		calculadoraIR.setContexto(new EstrategiaFaixa2_2015());
		
		double valor = calculadoraIR.calcularIR(3000);

		System.err.println(valor);
	}
}
