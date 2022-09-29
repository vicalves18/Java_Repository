package bytebankHerd;

//Herança
public class Designer extends Funcionario {
	
	
	//Construtor
	public double getBonificacao() {
		//super - usado para referenciar atributos da classe mãe.
		System.out.println("Bonificação Designer!!");
		return 200;
	}
	
	
	
}
