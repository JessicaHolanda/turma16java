package ex1;

import java.util.Scanner;

public class InstanciaCliente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Cliente cliente1 = new Cliente();
		
		System.out.println("\t\t SEJA BEM VINDE, CLIENTE!!!");

		System.out.println("Digite seu nome");
		cliente1.nomeCliente = scan.next();
		System.out.println("Digite M-masculino ou F-feminino O-outros: ");
		cliente1.generoCliente = scan.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano de nascimento [aaaa]: ");
		cliente1.anoNascimento = scan.nextInt();
		cliente1.statusGenero(cliente1.generoCliente);

		System.out.printf("\nOlá %s %s, sua idade aproximada é %d anos!!", 
				cliente1.statusGenero(cliente1.generoCliente),  
				cliente1.nomeCliente, cliente1.idadeAprox());
	}
}
