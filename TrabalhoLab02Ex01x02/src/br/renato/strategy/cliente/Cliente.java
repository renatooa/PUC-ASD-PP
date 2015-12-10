package br.renato.strategy.cliente;

import br.renato.strategy.CalculadoraIR;
import br.renato.strategy.Estrategia_2008;
import br.renato.strategy.Estrategia_2014;
import br.renato.strategy.Estrategia_2015;

public class Cliente {

	public static void main(String[] args) {

		CalculadoraIR calculadoraIR = new CalculadoraIR();

		double salario = 8527;

		System.out.println("Salario " + salario);

		calculadoraIR.setContexto(new Estrategia_2015());

		double valor2015 = calculadoraIR.calcularIR(salario);

		System.out.println("Valor em 2015 " + valor2015);
		
		calculadoraIR.setContexto(new Estrategia_2014());

		double valor2014 = calculadoraIR.calcularIR(salario);

		System.out.println("Valor em 2014 " + valor2014);
		
		calculadoraIR.setContexto(new Estrategia_2008());

		double valor2008 = calculadoraIR.calcularIR(salario);

		System.out.println("Valor em 2008 " + valor2008);
	}
}
