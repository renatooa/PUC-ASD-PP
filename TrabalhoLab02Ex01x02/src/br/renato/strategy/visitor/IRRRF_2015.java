package br.renato.strategy.visitor;

import br.renato.strategy.CalculadoraIR;
import br.renato.strategy.Estrategia_2015;

public class IRRRF_2015 implements AuditorVisitador {

	@Override
	public void visit(Empregado emp) {
		
		System.out.println("Visiador 2015 antes "+ emp.toString());

		CalculadoraIR calculadoraIR = new CalculadoraIR();

		calculadoraIR.setContexto(new Estrategia_2015());

		double valorIR = calculadoraIR.calcularIR(emp.salario);

		emp.setImpostoIr(valorIR);

		emp.setSalarioLiquido(emp.getSalario() - emp.getImpostoIr());
		
		System.out.println("Visiador 2015 apos "+ emp.toString());
	}

	@Override
	public void visit(Empresa emp) {
		
		System.out.println("Visiador 2015 antes " + emp.toString());

		double valor = 0;
		for (ContribuinteVisitado empregado : emp.getContribuinteVisitados()) {

			if (empregado instanceof Empregado) {

				valor += ((Empregado) empregado).getImpostoIr();
			}
			emp.setValortotalIr(valor);
		}
		
		System.out.println("Visiador 2015 apos "+ emp.toString());
	}
}
