package entidade;

import java.util.Scanner;

public class CursoIngles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Pessoa broder1 = new Pessoa("Jessica");
		Pessoa broder2 = new Pessoa("Hitomi", true);
		
		System.out.println("\t\t ESCOLA DE INGLÊS");

		System.out.println("Digite seu nome");
		broder1.nome = scan.next();

		System.out.println("Digite M-masculino ou F-feminino O-outros: ");
		broder1.genero = scan.next().toUpperCase().charAt(0);

		System.out.println("Digite o ano de nascimento [aaaa]: ");
		broder1.anoNascimento = scan.nextInt();
		
		broder1.statusGenero(broder1.genero);

		System.out.printf("\nOlá %s %s, sua idade aproximada é %d anos!!", broder1.statusGenero(broder1.genero),  broder1.nome, broder1.idade());

		
		if (broder1.idade() < 18) {
			broder1.statusIdade();
			System.out.println("Você pode realizar o módulo de curso Teens");
		}
		else
			System.out.println("Você pode fazer o curso de sua preferencia");
	}
	
}
