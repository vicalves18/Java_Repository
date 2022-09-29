package bytebankherd;

public class ContaCorrente extends Conta implements Tributavel {
	//Construtor não é herdado, precisa ser reescrito
	
	//Construtor especifico e não default
	public ContaCorrente(int agencia,int numero) {
		//super invoca os parametros da classe mãe para que saiba que é herdado o construtor da classe mãe
		super(agencia, numero);
	}
	
	
	//Sobrescrita
	//Anotação Override, indica que o metodo é uma sobrescrita da classe mãe
	//Indica que o metódo original foi alterado
	@Override
	public boolean saca(double valor) {
		double valorSacar = valor + 0.2; //taxa
		System.out.println("Taxa de 20 centavos ao sacar com CC!");
		return super.saca(valorSacar);
	}


	@Override
	public double getValImposto() {
		return super.saldo * 0.01;
	}
}
