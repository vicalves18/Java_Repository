package bytebankComp;

//Composição OO
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Rafael";
		paulo.cpf = "111.111.111-00";
		paulo.profissao = "Engenheiro";
		
		Conta contaPaulo = new Conta();
		contaPaulo.deposita(100);
		
		//associa o cliente paulo com a contaPaulo
		contaPaulo.titular = paulo;
		System.out.println(contaPaulo.titular.nome);
	}
}
