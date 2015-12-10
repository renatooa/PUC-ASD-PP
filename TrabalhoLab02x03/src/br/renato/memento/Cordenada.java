package br.renato.memento;

public class Cordenada {

	private int x = 0;
	private int y = 0;
	
	public Cordenada() {
	}

	public Cordenada(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Cordenada [x=" + x + ", y=" + y + "]";
	}
}
