package br.com.trab.cinco.modelo.negocio.venda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

import br.com.trab.cinco.modelo.dados.VendaMapper;
import br.com.trab.cinco.modelo.negocio.Filial;
import br.com.trab.cinco.modelo.negocio.Produto;
import br.com.trab.cinco.modelo.negocio.usuario.Operador;
import br.com.trab.cinco.modelo.negocio.venda.pagamento.PagamentoAutorizavel;
import br.com.trab.cinco.modelo.negocio.venda.pagamento.PagamentoStrategy;

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

	/**
	 * Conforme requisito R05
	 * 
	 * @return
	 */
	public double calcularValor() {

		DoubleSummaryStatistics summaryStatistics = vendaItens.stream()
				.collect(Collectors.summarizingDouble(item -> item.getValor()));

		return summaryStatistics.getSum();
	}

	/**
	 * Conforme requisito R03 e R04
	 */
	public String registrarItemVendido(Produto produto, double quantidade) {

		VendaItem vendaItem = new VendaItem(produto, quantidade);

		vendaItens.add(vendaItem);

		// Conforme Requisito 04
		return vendaItem.getDescricao();
	}

	/**
	 * Conforme requisito R04
	 * 
	 * @param produto
	 * @return
	 */
	public String exibirDescricaoItemVendido(Produto produto) {
		return vendaItens.stream()
				.filter(item -> produto.equals(item.getProduto()))
				.collect(Collectors.toList()).get(0).getDescricao();
	}

	/**
	 * Conformidade com os requisitos R06, R07 e R08
	 * 
	 * @param pagamento
	 */
	public void registrarPagamento(PagamentoStrategy pagamento) {

		boolean permitePagamento = !(pagamento instanceof PagamentoAutorizavel)
				|| ((PagamentoAutorizavel) pagamento).verificarPagamento();

		if (permitePagamento) {
			valorPago = pagamento.realizarPagamento(calcularValor());
			troco = pagamento.getValorTroco();
		}
	}

	/**
	 * Conforme requisito R09 e R10
	 * 
	 */
	public void confirmarVenda() {
		this.dataVenda = new Date();
		baixarEstoque();

		VendaMapper vendaMapper = new VendaMapper(this);
		vendaMapper.inserir();
	}

	/**
	 * Conforme requisito R09 e R11, baixa do esoque por {@link Filial filial}
	 */
	public void baixarEstoque() {
		vendaItens.forEach(item -> filial.baixarEstoque(item.getProduto(),
				item.getQuantidade()));
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
