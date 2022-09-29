package br.com.loja.orcamento;

import java.math.BigDecimal;

import br.com.loja.orcamento.situacao.EmAnalise;
import br.com.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {
	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacao;
	
	//Construtor
	public Orcamento(BigDecimal valor,int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		//instanciando situacao
		this.situacao = new EmAnalise();
	}
	
	//Padrão State
		//Classe que representa a situação
		//a propria situação que irá retratar o desconto e qual estado será realizado
		//através da exception
	public void aplicarDescontoExtra() {
		//calcular o proprio orcamento
		BigDecimal valorDescontoExtra = this.situacao.calValDescontoExtra(this);
		this.valor = this.valor.subtract(valorDescontoExtra);
	}
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	public void finalizar() {
		this.situacao.finalizar(this);
	}
	
	
	public BigDecimal getValor() {
		return valor;
	}
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	public SituacaoOrcamento getSituacao() {
		return situacao;
	}
	
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
	
}
