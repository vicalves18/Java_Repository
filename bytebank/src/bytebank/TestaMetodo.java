package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaVictoria = new Conta();
		contaVictoria.saldo=500;
		contaVictoria.deposita(100);
		System.out.println(contaVictoria.saldo);
		
		boolean conseguiuRetirar = contaVictoria.saca(50);
		System.out.println(contaVictoria.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaPaulo = new Conta();
		contaPaulo.deposita(5000);
		boolean sucessoTrans = contaPaulo.transfere(6000, contaVictoria, contaPaulo);
		
		if(sucessoTrans) {
			System.out.println("Transferência feita com sucesso!");
		}else {
			System.out.println("Não há saldo disponível para essa transferência!");
		}
		
		System.out.println("Saldo Paulo: "+contaPaulo.saldo);
		System.out.println("Saldo Victoria: "+contaVictoria.saldo);
		
		contaPaulo.titular = "Paulo Rafael";
		System.out.println(contaPaulo.titular);
		
		}

}
