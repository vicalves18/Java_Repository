//Simulando uma conexao 
public class Conexao implements AutoCloseable{
	public Conexao(){
		System.out.println("Abrindo Conex�o");
		//throw new IllegalStateException();
	}
	
	public void lerDados(){
		System.out.println("Recebendo Dados");
		//estado inconsistente 
		throw new IllegalStateException();
	}


	@Override
	public void close(){
		System.out.println("Fechando Conex�o");
		
	}
}
