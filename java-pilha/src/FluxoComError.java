
public class FluxoComError {
	
	public static void main(String[] args){
		System.out.println("Inicio do main");
		try{
			metodo1();
		}catch(ArithmeticException | NullPointerException  e){
			String msg = e.getMessage();
			System.out.println("Exception " + msg);
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1(){
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2(){
		System.out.println("Inicio metodo2");
		metodo2();
		System.out.println("Fim metodo2");
	}
}
