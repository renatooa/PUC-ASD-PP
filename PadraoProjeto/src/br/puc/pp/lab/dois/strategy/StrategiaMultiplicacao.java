package br.puc.pp.lab.dois.strategy;

import br.puc.pp.lab.dois.strategy.contrato.EstrategiaOperacaoMatematica;

/**
 * Padrão estrategia
 * 
 * @author 62241
 *
 */
public class StrategiaMultiplicacao implements EstrategiaOperacaoMatematica {

	@Override
	public double operacao(double operando1, double operando2) {

		return operando1 * operando2;
	}
}
