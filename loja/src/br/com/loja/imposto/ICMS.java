package br.com.loja.imposto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class ICMS implements Imposto{
	public BigDecimal calcular(Orcamento orcamento) {
		//valor orçamento * 0.1
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
}
