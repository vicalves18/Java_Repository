package br.com.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.loja.DomainException;
import br.com.loja.orcamento.Orcamento;

//Metodos para transitar os estados
public abstract class SituacaoOrcamento {
	public BigDecimal calValDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		//exceção de dominio
		throw new DomainException("Orcamento não pode ser Aprovado!");
	}
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento não pode ser Reprovado!");
	}
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Orcamento não pode ser Finalizado!");
	}
	
	
}
