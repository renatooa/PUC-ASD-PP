package br.renato.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.renato.facade.FacadeInterpretaExpressao;

/**
 * 
 * @author Renato
 *
 */
public class TesteOperacoes {

	FacadeInterpretaExpressao facadeInterpretaExpressao = null;

	@Before
	public void iniciar() {
		facadeInterpretaExpressao = new FacadeInterpretaExpressao();
	}

	@Test
	public void test3691() {

		String expressao = "36-91+*";

		executarEVerificarCalculo(expressao, -30.0);
	}

	@Test
	public void test512() {

		String expressao = "512++";

		executarEVerificarCalculo(expressao, 8.0);
	}

	@Test
	public void test91512() {

		String expressao = "91*512++-";

		executarEVerificarCalculo(expressao, 1.0);
	}

	@Test
	public void test556() {

		String expressao = "55/6*";

		executarEVerificarCalculo(expressao, 6.0);
	}

	private void executarEVerificarCalculo(String expressao, double esperado) {

		double result = facadeInterpretaExpressao.calcularExpressao(expressao);

		Assert.assertEquals(result, esperado, 0);
	}

}
