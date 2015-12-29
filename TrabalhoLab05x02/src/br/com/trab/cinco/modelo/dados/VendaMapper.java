package br.com.trab.cinco.modelo.dados;

import java.util.Collections;
import java.util.List;

import br.com.trab.cinco.modelo.negocio.venda.Venda;

public class VendaMapper {

	private Venda venda;

	public VendaMapper(Venda venda) {
		super();
		this.venda = venda;
	}

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
