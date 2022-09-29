
public class TesteConexao {

	public static void main(String[] args) {
	//------------Simplificando o try ---------------------
		//Precisa implementar a classe autocloseable
		try(Conexao conexao = new Conexao()){
			conexao.lerDados();
		}catch(IllegalStateException e){
			System.out.println("Erro na conexão");
		}
		

//		Conexao con = null;
//		
//		try{
//			con = new Conexao();
//			con.lerDados();
//			
//		}catch(IllegalStateException e){
//			System.out.println("Erro na conexão!");
//			
//		}finally {
//			System.out.println("Finally");
//			if(con != null){
//				con.close();
//			}
//		}

	}

}
