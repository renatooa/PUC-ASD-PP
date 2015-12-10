package br.puc.pp.composite;

import java.util.ArrayList;
import java.util.List;

public class ClienteFolha {

	public static void main(String[] args) {

		List<Supervisor> supervisors = new ArrayList<Supervisor>();

		for (int i = 0; i < 3; i++) {

			supervisors.add(new Supervisor("Sup " + i));
		}

		for (Supervisor supervisor : supervisors) {
			for (int i = 0; i < 3; i++) {
				supervisor.addCeletista(new Empregado("Emp " + i + " "
						+ supervisor.nome + ""));
			}
		}

		Gerente gerente = new Gerente(supervisors, "Gerente");
		
		gerente.calculaSalario();

	}

}
