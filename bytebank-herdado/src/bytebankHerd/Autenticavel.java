package bytebankHerd;

//Interface
	//Usa abstract em todo escopo
		//Não possue nada concreto - as classe que implentam
public abstract interface Autenticavel{
	
	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
}
