package br.renato.strategy;

import java.util.ArrayList;
import java.util.List;

import br.renato.strategy.base.EstrategiaBase;
import br.renato.strategy.contrato.EstrategiaCalculoImpostoRenda;

public class Estrategia_2008 implements EstrategiaCalculoImpostoRenda {

	List<EstrategiaCalculoImpostoRenda> estrategiasBase = null;

	public Estrategia_2008() {

		estrategiasBase = new ArrayList<EstrategiaCalculoImpostoRenda>();

		estrategiasBase.add(new EstrategiaBase(1372.81, 1372.81, 0));
		estrategiasBase.add(new EstrategiaBase(1372.82, 2743.25, 15));
		estrategiasBase.add(new EstrategiaBase(2743.25, 2743.25, 27.5));

	}

	@Override
	public double calcular(double salario) {

		double ir = 0;

		for (EstrategiaCalculoImpostoRenda estrategiaCalculoImpostoRenda : estrategiasBase) {
			ir += estrategiaCalculoImpostoRenda.calcular(salario);
		}

		return ir;
	}
}
