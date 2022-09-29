package bytebankHerd;

//classe abstrata - conceito para todos | não poder ser instanciada
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	//Construtor
	public abstract double getBonificacao();
	
	//----GETTERS AND SETTERS---
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
