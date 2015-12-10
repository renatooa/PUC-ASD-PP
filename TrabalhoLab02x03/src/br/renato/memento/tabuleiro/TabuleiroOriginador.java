package br.renato.memento.tabuleiro;

import br.renato.memento.Cordenada;

public class TabuleiroOriginador {

	private Tabuleiro tabuleiro = null;
	private TabuleiroCuidador tabuleiroCuidador = null;

	public TabuleiroOriginador() {
		tabuleiro = new Tabuleiro();
		tabuleiroCuidador = new TabuleiroCuidador();
		salvarTabuleiro();
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		salvarTabuleiro();
	}

	private void salvarTabuleiro() {
		tabuleiroCuidador.addCordenadaMenento(new TabuleiroMemento(tabuleiro));
	}

	public void retornarAnterior() {
		tabuleiro = tabuleiroCuidador.getAnterior().getTabuleiro();
	}

	public void irAtual() {
		tabuleiro = tabuleiroCuidador.getAtual().getTabuleiro();
	}

	public void retornar(int indiceJoga) {
		tabuleiro = tabuleiroCuidador.get(indiceJoga).getTabuleiro();
	}

	public void movimentar(Cordenada cordenadaTabuleiro, Peca peca) {
		Tabuleiro tabuleiroNovo = new Tabuleiro(tabuleiro.getCampoJogo());

		tabuleiroNovo.movimentar(cordenadaTabuleiro, peca);

		setTabuleiro(tabuleiroNovo);
	}
}
