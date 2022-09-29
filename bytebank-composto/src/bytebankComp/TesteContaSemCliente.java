package bytebankComp;

public class TesteContaSemCliente {
	public static void main(String[] args) {
		Conta contaVictoria = new Conta();
		System.out.println(contaVictoria.getSaldo());
		
		contaVictoria.titular = new Cliente();
		System.out.println(contaVictoria.titular);
		
		contaVictoria.titular.nome="Victoria Alves";
		System.out.println(contaVictoria.titular.nome);
	}
}
