package br.renato.memento.cliente;

import br.renato.memento.Cordenada;
import br.renato.memento.CuidadorCordenadaMemento;
import br.renato.memento.PecaOriginator;

public class Cliente {

	public static void main(String[] args) {

		PecaOriginator pecaOriginator = new PecaOriginator();

		CuidadorCordenadaMemento cuidadorCordenadaMemento = new CuidadorCordenadaMemento();

		cuidadorCordenadaMemento.addCordenadaMenento(pecaOriginator
				.salvarMemento());

		System.out.println("ini " + pecaOriginator.getCordenada());

		pecaOriginator.movimentar(new Cordenada(1, 2));

		System.out.println("mov 1 " + pecaOriginator.getCordenada());

		pecaOriginator.movimentar(new Cordenada(2, 2));

		System.out.println("mov 2 " + pecaOriginator.getCordenada());

		cuidadorCordenadaMemento.addCordenadaMenento(pecaOriginator
				.salvarMemento());

		pecaOriginator.movimentar(new Cordenada(3, 2));

		System.out.println("mov 3 " + pecaOriginator.getCordenada());

		cuidadorCordenadaMemento.addCordenadaMenento(pecaOriginator
				.salvarMemento());

		pecaOriginator.getStageMenento(cuidadorCordenadaMemento.get(0));

		System.out.println("Volta inicio " + pecaOriginator.getCordenada());

		pecaOriginator.getStageMenento(cuidadorCordenadaMemento.getAnterior());

		System.out.println("Volta anterior " + pecaOriginator.getCordenada());

		pecaOriginator.getStageMenento(cuidadorCordenadaMemento.getAtual());

		System.out.println("Volta Fim atual " + pecaOriginator.getCordenada());

	}
}
