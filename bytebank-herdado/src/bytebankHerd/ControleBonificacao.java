package bytebankHerd;

//Polimorfismo
public class ControleBonificacao {
	private double soma;
	
	//Funcionario classe mãe
	public void registra(Funcionario f) {
		//irá pegar bonificacao de cada classe filha espefica, pois todos vem da classe funcionario
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	public double getSoma() {
		return soma;
	}
}
