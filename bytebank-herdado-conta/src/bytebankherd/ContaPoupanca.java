package bytebankherd;

public class ContaPoupanca extends Conta {
	//Construtor não é herdado, precisa ser reescrito
	
	//Construtor especifico e não default
	public ContaPoupanca(int agencia,int numero) {
		//super invoca os parametros da classe mãe para que saiba que é herdado o construtor da classe mãe
		super(agencia, numero);
	}
}
