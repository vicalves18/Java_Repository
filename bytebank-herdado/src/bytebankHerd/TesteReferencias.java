package bytebankHerd;

public class TesteReferencias {

	public static void main(String[] args) {
		
		//Testando Polimorfismo
		//Funcionario = generico | Gerente=Especifico
		/*Funcionario g1 = new Gerente();
		g1.setNome("Lucas");
		String nome = g1.getNome();
		System.out.println(nome);*/
		
		//Só instancia caracteristicas da classe Funcionario, por ser de onde o atributo está sendo instanciado
		//metodo autentica não funcionará por ser da classe Gerente
		//g1.autentica(2222);
		
		
		//Todos são filhos da classe Funcionario, logo no polimorfismo ele faz essa varredura e pega o metodo especifico da classe 
		Funcionario g1 = new Gerente();
		g1.setNome("Bia");
		g1.setSalario(5000.0);
		
		//Classe Abstrata
		//Funcionario f = new Funcionario();
		//f.setSalario(2000.0);
		
		Funcionario ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Funcionario d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		//controle.registra(f);
		controle.registra(ev);
		controle.registra(d);

		System.out.println(controle.getSoma());
	}

}
