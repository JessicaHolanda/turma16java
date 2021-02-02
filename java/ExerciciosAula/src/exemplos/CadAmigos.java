package exemplos;

import java.util.Scanner;

import entidade.Pessoa;

public class CadAmigos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Pessoa broder1 = new Pessoa();

		System.out.println("Digite seu nome");
		broder1.nome = scan.next();

		System.out.println("Digite M-masculino ou F-feminino O-outros: ");
		broder1.genero = scan.next().toUpperCase().charAt(0);

		System.out.println("Digite o ano de nascimento [aaa]: ");
		broder1.anoNascimento = scan.nextInt();

		System.out.printf("\nOi %s, sua idade aproximada é %d anos!!", broder1.nome, broder1.idade());

		System.out.println("");

		if (broder1.idade() < 18) {
			statusIdade();
		}
		else
			System.out.println("Seja bem vinde!!!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}