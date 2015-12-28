package br.com.trab.cinco.modelo.usuario;

public class Gerente implements Usuario {
	

	@Override
	public boolean fazerLogin() {
		return false;
	}

	@Override
	public String getId() {
		return null;
	}

	@Override
	public String getSenha() {
		return null;
	}
}
