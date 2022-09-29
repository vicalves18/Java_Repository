package bytebankherd;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	//Composição
	private Cliente titular;
	//Static -> instância da classe e não do objeto
	private static int total;
	
	//Construtor
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("Total de Contas: "+Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Criando conta"+this.numero);
	}
	
	public void deposita(double valor) {
		//this invoca o atributo da classe Conta
		this.saldo +=  valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else
			return false;
	}
	
	public boolean transfere(double valor, Conta destino, Conta origem) {
		if(this.saldo >= valor) {
			origem.saca(valor);
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	//-------GETTERS AND SETTERS-----------
	
	//Encapsulamento 
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Valor Negativo não é permitido!");
			return;
		}
		
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if (agencia <=0) {
			System.out.println("Valor Negativo não é permitido!");
		}
		
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular){
		this.titular = titular;
	}
	public Cliente getTitular(){
		return titular;
	}
	//static por se tratar da instacia da classe
	//Não aceita this por conta do this se referir a atributo
	public static int getTotal(){
		return Conta.total;
	}
	
}
