package bytebankHerd;

//Herança
public class EditorVideo extends Funcionario {
	
	
	//Construtor
	public double getBonificacao() {
		//super - usado para referenciar atributos da classe mãe.
		System.out.println("Bonificação Editor Video!!");
		return 100;
	}
	
	
	
}
