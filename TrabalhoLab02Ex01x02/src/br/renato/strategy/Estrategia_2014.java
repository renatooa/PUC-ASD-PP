package br.renato.strategy;

import java.util.ArrayList;
import java.util.List;

import br.renato.strategy.base.EstrategiaBase;
import br.renato.strategy.contrato.EstrategiaCalculoImpostoRenda;

public class Estrategia_2014 implements EstrategiaCalculoImpostoRenda {

	List<EstrategiaCalculoImpostoRenda> estrategiasBase = null;

	public Estrategia_2014() {

		estrategiasBase = new ArrayList<EstrategiaCalculoImpostoRenda>();

		estrategiasBase.add(new EstrategiaBase(1787.77, 1787.77, 0));
		estrategiasBase.add(new EstrategiaBase(1787.78, 2679.29, 7.5));
		estrategiasBase.add(new EstrategiaBase(2679.30, 3572.43, 15));
		estrategiasBase.add(new EstrategiaBase(3572.44, 4463.81, 22.5));
		estrategiasBase.add(new EstrategiaBase(4463.81, 4463.81, 27.5));

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
