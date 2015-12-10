package br.renato.cliente;

import br.renato.facade.FacadeInterpretaExpressao;
/**
 * 
 * @author Renato
 *
 */
public class Cliente {

	public static void main(String[] args) {

		//String ex = "36-91+*";
		String ex = "91*512++-";
		

		FacadeInterpretaExpressao facadeInterpretaExpressao = new FacadeInterpretaExpressao();

		double resultado = facadeInterpretaExpressao.calcularExpressao(ex);

		System.out.println(resultado);
	}
}
