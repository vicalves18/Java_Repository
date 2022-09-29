package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

//Verifica regras a serem implementadas
	//Chain of Responsability
public class CalculadoraDescontos {
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoMaisCincoItens(
				new DescontoMaiorQuinhentos(new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}
}
