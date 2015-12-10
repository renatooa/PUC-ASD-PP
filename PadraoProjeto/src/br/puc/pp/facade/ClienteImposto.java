package br.puc.pp.facade;

public class ClienteImposto {

	public static void main(String[] args) {

		FacedaImposto facedaImposto = new FacedaImposto();

		double imposto = facedaImposto.calculaNotaFiscalSimplesMG();

		System.out.println("Imposto " + imposto);

	}

}
