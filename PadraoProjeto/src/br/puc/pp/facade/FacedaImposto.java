package br.puc.pp.facade;

import br.puc.pp.facade.subsistema.ICMS;
import br.puc.pp.facade.subsistema.IRRF;
import br.puc.pp.facade.subsistema.ISS;

/**
 * A facade abstraia a complecidade de algo;
 * 
 * </br> Abstrai sub-sistemas. </br> Saba fazer coisas pontuais mais faceis para
 * os clientes
 * 
 * </br>
 * 
 * Tende a ser uma especie de API
 * 
 * Faceda sempre tem que abstrair muitas classes, se tiver so uma é adapter
 * 
 * @author 62241
 *
 */
public class FacedaImposto {
	
	
	ISS iss = new ISS();
	IRRF irrf = new IRRF();
	ICMS icms = new ICMS();

	/**
	 * Realiza o calculo de imposto abstraindo toda a logica de negocio, este
	 * metodo irá chamar e instanciar todas as classes que são necessarios para
	 * fazer o calculo.
	 * 
	 * @return
	 */
	public double calculaNotaFiscalSimplesMG() {
		// IRRD + ICMS + ISS * 25

	

		return iss.calcularICMS(2) + irrf.calcularIRRF(2.6)
				+ icms.calcularICMS(3.6) + 10;
	}
}
