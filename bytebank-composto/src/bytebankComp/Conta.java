package bytebankComp;

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	//Composição
	Cliente titular;
	
	public void deposita(double valor) {
		//this invoca o atributo da classe Conta
		this.saldo +=  valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else
			return false;
	}
	
	public boolean transfere(double valor, Conta destino, Conta origem) {
		if(this.saldo >= valor) {
			origem.saca(valor);
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	//Encapsulamento 
	public double getSaldo() {
		return this.saldo;
	}
	
}
