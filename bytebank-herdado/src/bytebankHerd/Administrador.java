package bytebankHerd;

public class Administrador extends Funcionario implements Autenticavel{
	//Composição
	private AutenticacaoUtil autenticador;
		
	//Construtor
	public Administrador() {
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
	
	
	@Override
	public double getBonificacao() {
		return 50;
	}

}
