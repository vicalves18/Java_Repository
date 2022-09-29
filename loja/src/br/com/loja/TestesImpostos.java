package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.imposto.CalculadoraImpostos;
import br.com.loja.imposto.ISS;
import br.com.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
		
		CalculadoraImpostos calc = new CalculadoraImpostos();
		
		System.out.println(calc.calcular(orcamento,new ISS()));
	}

}
