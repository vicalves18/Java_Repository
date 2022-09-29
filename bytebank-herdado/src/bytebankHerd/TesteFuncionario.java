package bytebankHerd;

public class TesteFuncionario {

	public static void main(String[] args) {
		//Classe abstrata não pode ser trazida como objeto concreto, real
		//Funcionario victoria = new Funcionario();
		Funcionario victoria = new Gerente();
		victoria.setNome("Victoria Alves");
		victoria.setCpf("222.333.444-00");
		victoria.setSalario(2500.00);
		
		System.out.println("Nome funcionario: "+victoria.getNome());
		System.out.println("CPF funcionario: "+victoria.getCpf());
		System.out.println("Salario funcionario: "+victoria.getSalario());
		System.out.println("Bonificação: "+victoria.getBonificacao());

		
	}

}
