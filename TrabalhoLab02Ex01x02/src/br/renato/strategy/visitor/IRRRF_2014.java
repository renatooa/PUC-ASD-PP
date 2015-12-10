package br.renato.strategy.visitor;

import br.renato.strategy.CalculadoraIR;
import br.renato.strategy.EstrategiaFaixa1_2015;

public class IRRRF_2014 implements AliquocataVisitador {

	@Override
	public void visit(Empregado emp) {

		CalculadoraIR calculadoraIR = new CalculadoraIR();

		calculadoraIR.setContexto(new EstrategiaFaixa1_2015());

		double valorIR = calculadoraIR.calcularIR(emp.salario);

		emp.setImpostoIr(valorIR);
		emp.setSalarioLiquido(emp.getSalario() - emp.getImpostoIr());
	}

	@Override
	public void visit(Empresa emp) {

		double valor = 0;
		for (ContribuinteVisitado empregado : emp.getContribuinteVisitados()) {

			if (empregado instanceof Empregado ) {
				
				valor += ((Empregado)empregado).getImpostoIr();
				
			}
			
			emp.setValortotalIr(valor);
		}
	}
}
