package br.com.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

//herda SituacaoOrcamento
public class EmAnalise extends SituacaoOrcamento{
	//Pode ser reprovado ou aprovado
	public BigDecimal calcValDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply( new BigDecimal("0.05"));
	}
	
	public void aprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Aprovado());
	}
	public void reprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Reprovado());
	}
}

