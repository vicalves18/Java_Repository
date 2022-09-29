package bytebankEncap;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337,24226);
		//conta.setAgencia(50);
		//conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		conta.setAgencia(123123);
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337,1234);
		Conta conta3 = new Conta(5454,3465);
		
		System.out.println(Conta.getTotal());
	}
}
