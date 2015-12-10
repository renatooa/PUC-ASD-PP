package br.puc.pp.composite;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Celetista {

	List<Celetista> celetistas = new ArrayList<Celetista>();

	String nome;

	public Supervisor() {
	}

	public Supervisor(String nome) {
		super();
		this.nome = nome;
	}

	public double calculaSalario() {

		double salarioFunc = 0;

		for (Celetista celetista : celetistas) {
			salarioFunc += 0.01 * celetista.calculaSalario();
		}

		double salario = 1500 + salarioFunc;

		System.out.println("Salario Supervidor " + salario + " nome " + nome);

		return salario;
	}

	public void addCeletista(Celetista celetista) {
		celetistas.add(celetista);
	}
}
