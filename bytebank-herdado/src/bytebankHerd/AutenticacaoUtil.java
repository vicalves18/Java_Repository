package bytebankHerd;

//Composição - reutilização de código
public class AutenticacaoUtil {
	private int senha; //Por default é =0
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
}
