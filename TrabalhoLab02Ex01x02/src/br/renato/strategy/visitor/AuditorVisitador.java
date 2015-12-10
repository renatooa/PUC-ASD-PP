package br.renato.strategy.visitor;

public interface AuditorVisitador {

	public void visit(Empregado emp);

	public void visit(Empresa emp);
}
