package br.renato.memento.tabuleiro;

import java.awt.Color;

import br.renato.memento.Cordenada;

public class Casa {

	private Cordenada cordenada = null;
	private Color color = null;
	private Peca peca = null;

	public Casa() {
	}
	
	public Casa(Cordenada cordenada, Color color) {
		super();
		this.cordenada = cordenada;
		this.color = color;
	}

	public Casa(Cordenada cordenada, Color color, Peca peca) {
		super();
		this.cordenada = cordenada;
		this.color = color;
		this.peca = peca;
	}

	public Cordenada getCordenada() {
		return cordenada;
	}

	public void setCordenada(Cordenada cordenada) {
		this.cordenada = cordenada;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}

	@Override
	public String toString() {
		return "Casa [cordenada=" + cordenada.toString() + ", color=" + color + ", peca="
				+ peca + "]";
	}
}
