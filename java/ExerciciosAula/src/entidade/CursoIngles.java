package entidade;

import java.util.Scanner;

public class CursoIngles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Pessoa broder1 = new Pessoa("Jessica");
		Pessoa broder2 = new Pessoa("Hitomi", true);
		
		System.out.println("\t\t ESCOLA DE INGL�S");

		System.out.println("Digite seu nome");
		broder1.nome = scan.next();

		System.out.println("Digite M-masculino ou F-feminino O-outros: ");
		broder1.genero = scan.next().toUpperCase().charAt(0);

		System.out.println("Digite o ano de nascimento [aaaa]: ");
		broder1.anoNascimento = scan.nextInt();
		
		broder1.statusGenero(broder1.genero);

		System.out.printf("\nOl� %s %s, sua idade aproximada � %d anos!!", broder1.statusGenero(broder1.genero),  broder1.nome, broder1.idade());

		
		if (broder1.idade() < 18) {
			broder1.statusIdade();
			System.out.println("Voc� pode realizar o m�dulo de curso Teens");
		}
		else
			System.out.println("Voc� pode fazer o curso de sua preferencia");
	}
	
}
