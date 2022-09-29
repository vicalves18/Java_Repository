package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class DescontoMaisCincoItens extends Desconto{
	
	public DescontoMaisCincoItens(Desconto proximo) {
		super(proximo);
	}
	
	@Override
	//Fará somente a regra do desconto
		//Metodo será chamado na classe mãe
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens()>5;
	}
}
