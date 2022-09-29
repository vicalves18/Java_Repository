package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class DescontoMaiorQuinhentos extends Desconto{
	//construtor
	public DescontoMaiorQuinhentos(Desconto proximo) {
		super(proximo);
	}
	
	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0 ;
	}
}
