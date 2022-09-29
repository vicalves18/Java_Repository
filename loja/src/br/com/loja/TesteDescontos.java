package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.desconto.CalculadoraDescontos;
import br.com.loja.orcamento.Orcamento;

public class TesteDescontos {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(new BigDecimal("500"),6);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"),2);
		
		CalculadoraDescontos calc = new CalculadoraDescontos();
		
		System.out.println(calc.calcular(primeiro));
		System.out.println(calc.calcular(segundo));

	}

}
