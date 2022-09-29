package br.com.loja;

public class DomainException extends RuntimeException {
	//serializa o objeto, determina compatibilidade entre objeto e classe
		//evita insconstancia na recuperação do estado
	private static final long serialVerisonUID = 1L;
	
	//Construtor
	public DomainException(String mensagem) {
		super(mensagem);
	}
}
