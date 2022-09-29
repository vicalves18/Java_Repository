package br.com.loja.pedido.acao;

import br.com.loja.pedido.Pedido;
//Observer
//Evita que a lógica apareceça na execução
public class SalvarPedidoNoBD implements AcaoAposGerarPedido{
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados!");
	}
}
