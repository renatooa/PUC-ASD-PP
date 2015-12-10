package br.puc.pp.adapter;

/**
 * Adapter é sempre um para um
 * 
 * </br> O adaptador so conhece seu adaptado
 * 
 * </br>
 * 
 * Adapta somente uma classe
 * 
 * @author 62241
 *
 */
public class AdapterAluno {

	private Aluno aluno = null;

	public AdapterAluno(Aluno aluno) {
		super();
		this.aluno = aluno;
	}

	public String getPrimeroNome() {
		return aluno.getNome().split(" ")[0];

	}

	public String getSobreNome() {
		return aluno.getNome().split(" ")[1];
	}
}
