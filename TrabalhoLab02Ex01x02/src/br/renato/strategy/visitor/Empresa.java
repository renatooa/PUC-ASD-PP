package br.renato.strategy.visitor;

import java.util.List;

public class Empresa implements ContribuinteVisitado {

	private List<ContribuinteVisitado> contribuinteVisitados = null;

	private double valortotalIr = 0;

	public Empresa() {
	}

	public void aceita(AliquocataVisitador aliVisitador) {

		for (ContribuinteVisitado contribuinteVisitado : contribuinteVisitados) {
			contribuinteVisitado.aceita(aliVisitador);
		}

		aliVisitador.visit(this);
	}

	public List<ContribuinteVisitado> getContribuinteVisitados() {
		return contribuinteVisitados;
	}

	public void setContribuinteVisitados(
			List<ContribuinteVisitado> contribuinteVisitados) {

		this.contribuinteVisitados = contribuinteVisitados;
	}

	public double getValortotalIr() {
		return valortotalIr;
	}

	public void setValortotalIr(double valortotalIr) {
		this.valortotalIr = valortotalIr;
	}

}
