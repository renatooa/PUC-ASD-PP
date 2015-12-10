package br.renato.memento;

import java.util.ArrayList;
import java.util.List;

public class CuidadorCordenadaMemento {

	private List<CordenadaMenento> cordenadaMenentos = null;

	public CuidadorCordenadaMemento() {

		cordenadaMenentos = new ArrayList<CordenadaMenento>();
	}

	public void addCordenadaMenento(CordenadaMenento cordenadaMenento) {
		cordenadaMenentos.add(cordenadaMenento);
	}

	public CordenadaMenento get(int indice) {
		return cordenadaMenentos.get(indice);
	}
	
	public CordenadaMenento getAnterior() {
		return cordenadaMenentos.get(cordenadaMenentos.size() - 2);
	}
	
	public CordenadaMenento getAtual() {
		return cordenadaMenentos.get(cordenadaMenentos.size() - 1);
	}
}
