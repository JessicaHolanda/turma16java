package encapsulamento;

public class Principal {

	public static void main(String[] args) {
		
		PessoaFisica cliente1 = new PessoaFisica("001", "03/02/2021", "Dani");
		
		System.out.printf("Bem vindo, %s", cliente1.getNome());
		
		cliente1.solicitarEmprestimoPF();
		
	}

}
