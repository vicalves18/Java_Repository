package br.com.loja.pedido.acao;

import br.com.loja.pedido.Pedido;

//Polimorfismo
public interface AcaoAposGerarPedido {
	public void executarAcao(Pedido pedido);
}
