package br.com.trab.cinco.modelo.venda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

import br.com.trab.cinco.modelo.Filial;
import br.com.trab.cinco.modelo.Produto;
import br.com.trab.cinco.modelo.usuario.Operador;
import br.com.trab.cinco.modelo.venda.pagamento.PagamentoAutorizavel;
import br.com.trab.cinco.modelo.venda.pagamento.PagamentoStrategy;

public class Venda {

	private Date dataVenda = null;

	private Operador operador = null;

	private Collection<VendaItem> vendaItens = null;

	private double valorPago = 0;

	private double troco = 0;

	private Filial filial = null;

	public Venda(Filial filial, Operador operador) {
		vendaItens = new ArrayList<>();
		this.filial = filial;
		this.operador = operador;
	}

	public double calcularValor() {

		DoubleSummaryStatistics summaryStatistics = vendaItens.stream()
				.collect(Collectors.summarizingDouble(item -> item.getValor()));

		return summaryStatistics.getSum();
	}

	public String registrarItemVendido(Produto produto, double quantidade) {

		VendaItem vendaItem = new VendaItem(produto, quantidade);

		vendaItens.add(vendaItem);
		
		return vendaItem.getDescricao();
	}

	public String exibirDescricaoItemVendido(Produto produto) {
		return vendaItens.stream().filter(item -> produto.equals(item.getProduto())).collect(Collectors.toList()).get(0)
				.getDescricao();
	}

	public void registrarPagamento(PagamentoStrategy pagamento) {

		boolean permitePagamento = !(pagamento instanceof PagamentoAutorizavel)
				|| ((PagamentoAutorizavel) pagamento).verificarPagamento();

		if (permitePagamento) {
			valorPago = pagamento.realizarPagamento(calcularValor());
			troco = pagamento.getValorTroco();
		}
	}

	public void confirmarVenda() {
		this.dataVenda = new Date();
		baixarEstoque();
	}

	public void baixarEstoque() {
		vendaItens.forEach(item -> filial.baixarEstoque(item.getProduto(), item.getQuantidade()));
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Operador getOperador() {
		return operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}

	public Collection<VendaItem> getVendaItens() {
		return vendaItens;
	}

	public void setVendaItens(Collection<VendaItem> vendaItens) {
		this.vendaItens = vendaItens;
	}

	public double getTroco() {
		return troco;
	}

	public void setTroco(double troco) {
		this.troco = troco;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
}
