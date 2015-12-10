package br.renato.memento.tabuleiro.cliente;

import java.awt.Color;

import br.renato.memento.Cordenada;
import br.renato.memento.tabuleiro.Peca;
import br.renato.memento.tabuleiro.TabuleiroOriginador;

public class Cliente {

	public static void main(String[] args) {

		TabuleiroOriginador tabuleiroOriginador = new TabuleiroOriginador();

		tabuleiroOriginador.movimentar(new Cordenada(2, 0), new Peca(
				Color.black));

		tabuleiroOriginador.movimentar(new Cordenada(2, 0), new Peca(
				Color.WHITE));

		tabuleiroOriginador
				.movimentar(new Cordenada(2, 0), new Peca(Color.RED));

		tabuleiroOriginador.getTabuleiro().imprimirJogo();

		tabuleiroOriginador.retornarAnterior();

		tabuleiroOriginador.getTabuleiro().imprimirJogo();

	}
}
