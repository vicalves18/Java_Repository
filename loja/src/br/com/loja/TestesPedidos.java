package br.com.loja;

import java.math.BigDecimal;
import java.util.Arrays;
import br.com.loja.pedido.GeraPedido;
import br.com.loja.pedido.GeraPedidoHandler;
import br.com.loja.pedido.acao.EnviarEmailPedido;
import br.com.loja.pedido.acao.SalvarPedidoNoBD;

public class TestesPedidos {
	//Representação de uma interface com usuario -> por meio de linha de comando
	public static void main(String[] args) {
		//Receber informações por linha de comando
			//Pega o primeiro parametro passado -> Cliente "args[]"
		String cliente = "Victoria";
			//Valor orçamento -> Segundo paramento da classe geraPedido
		BigDecimal valorOrcamento = new BigDecimal("300");
			//Quantidade Itens -> Terceiro paramento passado
		int quantidadeItens = Integer.parseInt("2");
		
		//Separa os dados do  comando e a execução do comando
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento,quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(/*dependencias*/Arrays.asList(new SalvarPedidoNoBD(), new EnviarEmailPedido()));
		handler.execute(gerador);
	}

}
