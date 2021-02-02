package ex6;

import java.util.Scanner;

public class InstanciaConta {
	
	public static ContaBancaria contaBancaria = new ContaBancaria();
	
	public static void main(String[] args) {
		
		String conta;
		int opcao;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tipo de conta [Corrente] [Poupança]");
		conta = scan.next();
		contaBancaria.setTipoConta(conta);
		
		System.out.println("BEM VINDO AO BANCO GENERATION");
		System.out.printf("Saldo atual: R$ %.2f \n\n", contaBancaria.getSaldo());
		System.out.println("\nSelecione uma opção: ");
		System.out.println("1 - Debitar");
		System.out.println("2 - Creditar");
		System.out.println("3 - Sair");
		opcao = scan.nextInt();

		switch (opcao) {
		case 1:
			contaBancaria.debitar();
				System.out.printf("\nO novo saldo é de: R$ %.2f", contaBancaria.getSaldo());
			break;
		case 2:
			contaBancaria.creditar();
			System.out.printf("\nO novo saldo é de: R$ %.2f", contaBancaria.getSaldo());
			break;
	
		case 3:
			System.out.println("Programa finalizado!");
					
			break;
		default:
			System.out.println("Opção inválida!!!");
		}		
	}
}
