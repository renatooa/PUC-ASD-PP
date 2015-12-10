package br.renato.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.renato.facade.FacadeInterpretaExpressao;

public class TesteObrigatorio {
	
	
	FacadeInterpretaExpressao facadeInterpretaExpressao = null;

	@Before
	public void iniciar() {
		facadeInterpretaExpressao = new FacadeInterpretaExpressao();
	}
	


	@Test
	public void test96() {
		
		String expressao = "96+";

		executarEVerificarCalculo(expressao, 15.0);
	}
	
	@Test
	public void test836() {
		
		String expressao = "836*+";

		executarEVerificarCalculo(expressao, 26.0);
	}
	
	@Test
	public void test9437() {
		
		String expressao = "94*37*-";

		executarEVerificarCalculo(expressao, 15.0);
	}
	
	
	private void executarEVerificarCalculo(String expressao, double esperado) {

		double result = facadeInterpretaExpressao.calcularExpressao(expressao);

		Assert.assertEquals(result, esperado, 0);
	}

}
