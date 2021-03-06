package br.com.trab.cinco.modelo.negocio.usuario;

public class Operador implements Usuario {

	private String nome = null;

	private String id = null;

	private String senha = null;

	private Gerente gerente = null;

	public Operador(Gerente gerente) {
		this.gerente = gerente;
	}

	/**
	 * Conforme quequisito R02
	 */
	@Override
	public boolean fazerLogin() {
		// Requisito R01
		return gerente.iniciar() && senha.equals("teste")
				&& id.equals("operador");
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
