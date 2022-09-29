package br.com.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.loja.orcamento.Orcamento;
import br.com.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {
	//Pega todas as classe que implementam a interface -> Salvar, enviar email
	private List<AcaoAposGerarPedido> acoes;
	
	//Constutor
		//Classe implementando a Interface
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

		/*construtor para injecao de depencias: repository,service...
			Caso usasse api, email...*/
	
		//Lógica para executar o comando  
			//Dispara o evento
		public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		//dada a ação e sua execução
			//Torna o código mais flexivel podendo alterar as ações 
		acoes.forEach(a -> a.executarAcao(pedido));
		
		/*Usaria as informações que viria das injeções de dependencias
			Viria em uma classe separada
		System.out.println("Salvar Pedido!");
		System.out.println("Salvar Pedido no Banco de dados!");
		*/
		

		
	}
}
