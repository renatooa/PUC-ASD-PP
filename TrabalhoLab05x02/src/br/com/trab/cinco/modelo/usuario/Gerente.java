package br.com.trab.cinco.modelo.usuario;

public class Gerente implements Usuario {

	private String nome = null;

	private String id = null;

	private String senha = null;

	public Gerente() {
	}

	@Override
	public boolean fazerLogin() {
		return senha.equals("teste") && id.equals("root");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
