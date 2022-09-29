package bytebankHerd;

//Herança  |  Interface
public class Gerente extends Funcionario implements Autenticavel{
	//Composição
	private AutenticacaoUtil autenticador;
			
	//Construtor
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
		
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}
	
	//Construtor
	public double getBonificacao() {
		//super - usado para referenciar atributos da classe mãe.
		System.out.println("Bonificação Gerente!!");
		return 200;
	}
	
	
	
}
