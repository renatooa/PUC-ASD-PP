package br.renato.memento.tabuleiro;

public class TabuleiroMemento {

	Tabuleiro tabuleiro = null;

	public TabuleiroMemento(Tabuleiro tabuleiro) {
		super();
		this.tabuleiro = tabuleiro;
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
}
