package br.renato.strategy.visitor.cliente;

import java.util.ArrayList;
import java.util.List;

import br.renato.strategy.visitor.ContribuinteVisitado;
import br.renato.strategy.visitor.Empregado;
import br.renato.strategy.visitor.Empresa;
import br.renato.strategy.visitor.IRRRF_2014;
import br.renato.strategy.visitor.IRRRF_2015;

public class Cliente {

	public static void main(String[] args) {

		List<ContribuinteVisitado> contribuintes = new ArrayList<ContribuinteVisitado>();

		for (int i = 1; i < 10; i++) {
			contribuintes.add(new Empregado(960 * i));
		}

		Empresa empresa = new Empresa();

		empresa.setContribuinteVisitados(contribuintes);

		empresa.aceita(new IRRRF_2014());
		
		empresa.aceita(new IRRRF_2015());
	}

}
