package br.renato.memento.tabuleiro;

import java.util.ArrayList;
import java.util.List;

public class TabuleiroCuidador {
	
	private List<TabuleiroMemento> tabuleiroMementos = null;
	
	public TabuleiroCuidador() {
		
		tabuleiroMementos = new ArrayList<TabuleiroMemento>();
	}
	
	public void addCordenadaMenento(TabuleiroMemento tabuleiroMemento) {
		tabuleiroMementos.add(tabuleiroMemento);
	}

	public TabuleiroMemento get(int indice) {
		return tabuleiroMementos.get(indice);
	}
	
	public TabuleiroMemento getAnterior() {
		return tabuleiroMementos.get(tabuleiroMementos.size() - 2);
	}
	
	public TabuleiroMemento getAtual() {
		return tabuleiroMementos.get(tabuleiroMementos.size() - 1);
	}

}
