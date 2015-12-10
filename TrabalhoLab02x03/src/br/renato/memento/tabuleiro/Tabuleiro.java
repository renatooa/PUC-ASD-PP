package br.renato.memento.tabuleiro;

import java.awt.Color;

import br.renato.memento.Cordenada;

public class Tabuleiro {

	Casa[][] campoJogo = new Casa[8][8];

	public Tabuleiro() {

		for (int i = 0; i < 8; i++) {
			for (int y = 0; y < 8; y++) {

				Color color = (i + y) % 2 == 0 ? Color.WHITE : Color.BLACK;
				campoJogo[i][y] = new Casa(new Cordenada(i, y), color);
			}
		}
	}

	public Tabuleiro(Casa[][] campoJogo) {
		for (int i = 0; i < 8; i++) {
			for (int y = 0; y < 8; y++) {
				this.campoJogo[i][y] = new Casa(campoJogo[i][y].getCordenada(),
						campoJogo[i][y].getColor(), campoJogo[i][y].getPeca());
			}
		}
	}

	public Casa[][] getCampoJogo() {
		return campoJogo;
	}

	public void setCampoJogo(Casa[][] campoJogo) {
		this.campoJogo = campoJogo;
	}

	public void imprimirJogo() {

		for (int i = 0; i < 8; i++) {
			for (int y = 0; y < 8; y++) {

				System.out.println(campoJogo[i][y].toString());

			}
		}
	}

	public void movimentar(Cordenada cordenadaTabuleiro, Peca peca) {

		campoJogo[cordenadaTabuleiro.getX()][cordenadaTabuleiro.getY()]
				.setPeca(peca);
	}

	@Override
	public Tabuleiro clone() {
		try {
			return (Tabuleiro) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
