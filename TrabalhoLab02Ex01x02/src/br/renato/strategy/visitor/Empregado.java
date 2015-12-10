package br.renato.strategy.visitor;

public class Empregado implements ContribuinteVisitado {

	double salario = 2000.00;

	double salarioLiquido = 0;
	double impostoIr = 0;

	@Override
	public void aceita(AliquocataVisitador aliVisitador) {
		
		aliVisitador.visit(this);

	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public double getImpostoIr() {
		return impostoIr;
	}

	public void setImpostoIr(double impostoIr) {
		this.impostoIr = impostoIr;
	}
}
