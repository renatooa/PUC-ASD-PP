package br.renato.strategy;

import java.util.ArrayList;
import java.util.List;

import br.renato.strategy.base.EstrategiaBase;
import br.renato.strategy.contrato.EstrategiaCalculoImpostoRenda;

public class Estrategia_2015 implements EstrategiaCalculoImpostoRenda {

	List<EstrategiaCalculoImpostoRenda> estrategiasBase = null;

	public Estrategia_2015() {

		estrategiasBase = new ArrayList<EstrategiaCalculoImpostoRenda>();

		estrategiasBase.add(new EstrategiaBase(1903.98, 1903.98, 0));
		estrategiasBase.add(new EstrategiaBase(1903.99, 2826.65, 7.5));
		estrategiasBase.add(new EstrategiaBase(2826.66, 3751.05, 15));
		estrategiasBase.add(new EstrategiaBase(3751.06, 4664.68, 22.5));
		estrategiasBase.add(new EstrategiaBase(4664.68, 4664.68, 27.5));

	}

	@Override
	public double calcular(double salario) {
		
		double ir = 0;
		
		for (EstrategiaCalculoImpostoRenda estrategiaCalculoImpostoRenda : estrategiasBase) {
			double valorFaixa = estrategiaCalculoImpostoRenda.calcular(salario);
			ir += valorFaixa;
		}

		return ir;
	}
}
