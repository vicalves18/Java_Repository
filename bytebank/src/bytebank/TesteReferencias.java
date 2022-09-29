package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo Primeira Contas é: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo Segunda Conta é :" + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo Segunda Conta é: "+segundaConta.saldo);
		
		System.out.println("Saldo Primeira Conta é: "+primeiraConta.saldo);
		
		if(primeiraConta==segundaConta) {
			System.out.println("São a Mesma conta!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
