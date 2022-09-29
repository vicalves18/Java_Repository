package bytebankherd;

public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 2324);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(123, 2224);
		cp.deposita(200);
		
		cc.transfere(10.0, cp, cc);
		
		System.out.println("Conta-Corrente: "+cc.getSaldo());
		System.out.println("Conta-Poupança: "+cp.getSaldo());
		

	}

}
