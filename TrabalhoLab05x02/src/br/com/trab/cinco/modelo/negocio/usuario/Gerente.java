package br.com.trab.cinco.modelo.negocio.usuario;

public class Gerente implements Usuario {

	private String nome = null;

	private String id = null;

	private String senha = null;

	public Gerente() {
	}

	/**
	 * Conforme rrequisito R01
	 */
	@Override
	public boolean fazerLogin() {
		return senha.equals("teste") && id.equals("root");
	}

	/**
	 * Conforme rrequisito R01
	 */
	public void sair() {
		if (fazerLogin()) {
			System.exit(0);
		}
	}

	/**
	 * Conforme rrequisito R01
	 */
	public boolean iniciar() {
		if (fazerLogin()) {
			System.out.print("Entrando no sistema");
			return true;
		}
		return false;
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
