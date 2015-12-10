package br.puc.pp.composite;

public class Empregado implements Celetista {

	String nome;

	public Empregado(String nome) {
		super();
		this.nome = nome;
	}

	public Empregado() {
	}

	public double calculaSalario() {

		System.out.println("Salario empregado 1000" + nome);

		return 1000;
	}

}
