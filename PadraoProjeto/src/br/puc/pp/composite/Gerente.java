package br.puc.pp.composite;

import java.util.List;

public class Gerente implements Celetista {

	List<Celetista> celetistas;

	String nome;

	@SuppressWarnings("unchecked")
	public Gerente(List<? extends Celetista> celetistas, String nome) {
		super();
		this.celetistas = (List<Celetista>) celetistas;
		this.nome = nome;
	}

	public Gerente() {
	}

	public double calculaSalario() {

		double salarioFunc = 0;

		for (Celetista celetista : celetistas) {
			salarioFunc += 0.01 * celetista.calculaSalario();
		}

		double salario = salarioFunc + 2000;

		System.out.println("Gerente " + salario + " nome " + nome);

		return salario;
	}
}
