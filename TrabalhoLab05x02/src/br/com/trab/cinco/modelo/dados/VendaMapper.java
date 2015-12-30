package br.com.trab.cinco.modelo.dados;

import java.util.Collections;
import java.util.List;

import br.com.trab.cinco.modelo.negocio.venda.Venda;

/**
 * Classe que representa acesso a dados da Classe {@link Venda}, para atender o
 * requisito R010
 * 
 * 
 * @author Renato
 *
 */
public class VendaMapper {

	private Venda venda;

	public VendaMapper(Venda venda) {
		super();
		this.venda = venda;
	}

	/**
	 * Regista um venda conforme Requisito R10
	 */
	public void inserir() {

		// persitir venda

		System.out.println("persistindo venda " + venda.getDataVenda());
	}

	public void apagar() {

	}

	public void atualizar() {

	}

	public List<Venda> pesquisar() {
		return Collections.emptyList();
	}
}
