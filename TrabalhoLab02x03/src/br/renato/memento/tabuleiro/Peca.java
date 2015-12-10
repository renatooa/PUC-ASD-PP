package br.renato.memento.tabuleiro;

import java.awt.Color;

public class Peca {

	private Color color = null;

	public Peca() {
	}

	public Peca(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Peca [color=" + color + "]";
	}
}
