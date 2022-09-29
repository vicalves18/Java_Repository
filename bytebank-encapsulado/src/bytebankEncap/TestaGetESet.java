package bytebankEncap;

public class TestaGetESet {
	public static void main(String[] args) {
		//alterado por conta dos parametros do construtor
		Conta conta = new Conta(1337,24226);
		//conta.numero = 1337;
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//paulo.nome = "Paulo Rafael";
		paulo.setNome("Paulo Rafael");
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Engenheiro");
		
		/*-Outra forma:
		 * CLiente titularDaConta = conta.getTitular();
		 * titularDaConta.setProfissao("Engenheiro");
		 * System.out.println(titularDaConta);-*/
		
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}
	
}
