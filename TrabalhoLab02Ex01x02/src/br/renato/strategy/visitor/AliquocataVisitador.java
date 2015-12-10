package br.renato.strategy.visitor;

public interface AliquocataVisitador {

	public void visit(Empregado emp);

	public void visit(Empresa emp);
}
