package br.com.trab.cinco.modelo.negocio.usuario;

/**
 * Interface que padroniza o comportamento Do Operador e Gerente Conforme
 * requisitos 01 e 02
 * 
 * @author Renato
 *
 */
public interface Usuario {

	/**
	 * R 01
	 * @return
	 */
	public boolean fazerLogin();

	/**
	 * R 01
	 * @return
	 */
	public String getId();

	/**
	 * R 01
	 * @return
	 */
	public String getSenha();
}
