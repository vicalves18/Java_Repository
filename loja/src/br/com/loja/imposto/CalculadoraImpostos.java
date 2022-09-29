package br.com.loja.imposto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

//Strategy
public class CalculadoraImpostos {
	//Polimorfismo
	public BigDecimal calcular(Orcamento orcamento,Imposto imposto) {
		return imposto.calcular(orcamento);
		
	}
}
