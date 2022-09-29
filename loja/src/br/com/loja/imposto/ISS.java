package br.com.loja.imposto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class ISS implements Imposto{
	public BigDecimal calcular(Orcamento orcamento) {
		//valor orçamento * 0.06
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}
}
