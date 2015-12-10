package br.renato.memento;

public class PecaOriginator {

	private Cordenada cordenada = null;

	public PecaOriginator() {

		cordenada = new Cordenada(0, 0);

	}

	public Cordenada getCordenada() {
		return cordenada;
	}

	public void setCordenada(Cordenada cordenada) {
		this.cordenada = cordenada;
	}

	public CordenadaMenento salvarMemento() {
		return new CordenadaMenento(cordenada);
	}

	public void getStageMenento(CordenadaMenento cordenadaMenento) {
		this.cordenada = cordenadaMenento.getCordenada();
	}

	public void movimentar(Cordenada cordenada) {
		this.cordenada = cordenada;
	}
}
