package br.com.loja.pedido.acao;

import br.com.loja.pedido.Pedido;

//Observer
public class EnviarEmailPedido implements AcaoAposGerarPedido{
	//Classe para injerir as depencias
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email com dados do Pedido!");
	}
}
