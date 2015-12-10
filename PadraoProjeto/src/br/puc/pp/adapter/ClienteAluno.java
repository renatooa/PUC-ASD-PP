package br.puc.pp.adapter;


public class ClienteAluno {

	public static void main(String[] args) {

		Aluno aluno = new Aluno("Renato Alves");

		System.out.println("Aluno " + aluno.getNome());
		
		
		System.out.println("*****************************************");

		System.out.println("Adapter Nome");

		AdapterAluno adapterAluno = new AdapterAluno(aluno);

		System.out.println("Primeiro " + adapterAluno.getPrimeroNome());
		System.out.println("Segundo " + adapterAluno.getSobreNome());

	}
}
