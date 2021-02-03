package bank16;

import java.util.Scanner;

public class Testa {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta("010101-1", "666.666.666-66");
		double valor;
		int opc;
		char resp;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t\t BANK 16");
		System.out.printf("\nCliente: %s ", conta1.getNumero());
		System.out.printf("\nSaldo atual: R$ %.2f \n\n", conta1.getSaldo());

		System.out.println("OPÇÕES DISPONIVEIS: ");
		System.out.println("1 - Debitar");
		System.out.println("2 - Creditar");
		System.out.println("3 - Sair");
		opc = scan.nextInt();

		switch (opc) {
		case 1:
			do {
				System.out.println("\nDigite o valor que quer debitar: ");
				valor = scan.nextDouble();

				if (valor > conta1.getSaldo()) {
					System.out.println("\nValor maior que o disponível em conta");
				}	
			} while (valor > conta1.getSaldo());
			
			conta1.debitar(valor);
			do {
				System.out.printf("\nO novo saldo é de: R$ %.2f", conta1.getSaldo());
			
				System.out.println("\n\nDeseja debitar outro valor S/N? ");

				resp = scan.next().charAt(0);

				if (resp == 'S' || resp == 's') {
					conta1.debitar(valor);
				}
			} while (resp == 'S' || resp == 's');
			break;
			
		case 2:
			
			System.out.println("\nDigite o valor que quer creditar: ");
			valor = scan.nextDouble();
			conta1.creditar(valor);
			
			do {
				System.out.printf("\nO novo saldo é de: R$ %.2f", conta1.getSaldo());
				
				System.out.println("\n\nDeseja creditar outro valor S/N? ");

				resp = scan.next().charAt(0);

				if (resp == 'S' || resp == 's') {
					System.out.println("\nDigite o valor que quer creditar: ");
					valor = scan.nextDouble();
					conta1.creditar(valor);
				}

			} while (resp == 'S' || resp == 's');
			
			break;
			
			
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida!!!");
		}

	}
		

}
