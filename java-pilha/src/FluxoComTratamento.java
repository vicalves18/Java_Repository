
public class FluxoComTratamento {
	
	public static void main(String[] args){
		System.out.println("Inicio do main");
		try{
			metodo1();
		}catch(ArithmeticException | NullPointerException | MinhaExcecao  e){
			String msg = e.getMessage();
			System.out.println("Exception " + msg);
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1() throws MinhaExcecao{
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	//checked
	private static void metodo2() throws MinhaExcecao{
		System.out.println("Inicio do metodo2");
		Conta c = new Conta();
		throw new MinhaExcecao("Deu errado");
		
		//System.out.println("Fim do metodo2");
	}
}
