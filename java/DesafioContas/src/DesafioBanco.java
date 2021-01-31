import java.util.Scanner;

public class DesafioBanco {
	
	public static ContaEmpresa contaEmpresa = new ContaEmpresa();
	public static String extrato[] = new String[10];

	public static void main(String[] args) {
		int conta;
		Scanner scan = new Scanner(System.in);
		ContaEmpresa empresa = new ContaEmpresa();

		System.out.println("BANCO G7 \n");
		System.out.println("1 - Conta Poupança");
		System.out.println("2 - Conta Corrente");
		System.out.println("3 - Conta Especial");
		System.out.println("4 - Conta Empresa");
		System.out.println("5 - Conta Estudantil");
		System.out.println("6 - Sair");
		conta = scan.nextInt();

		switch (conta) {
		case 1:

			break;

		case 2:

			break;

		case 3:

			break;

		case 4:
			contaEmpresa();
			break;

		case 5:

			break;

		case 6:
			System.exit(0);
			break;

		default:
			System.out.println("Opção inválida!");
		}
	}

	public static void contaEmpresa() {
		int opcao;
		char resp = 'N';
		Scanner scan = new Scanner(System.in);
		
		System.out.println("**********************************************");
		System.out.println("CONTA EMPRESARIAL\nBem vindo!\n");
		System.out.printf("Saldo atual: R$ %f \n\n", contaEmpresa.getSaldo());

		System.out.println("OPÇÕES DISPONIVEIS: ");
		System.out.println("1 - Emprestimo");
		System.out.println("2 - Debitar");
		System.out.println("3 - Creditar");
		System.out.println("4 - Voltar ao menu anterior");
		System.out.println("5 - Exibir extrato");
		System.out.println("6 - Sair");
		opcao = scan.nextInt();
	
		switch (opcao) {
		case 1:
			contaEmpresa.getEmprestimo();
			
			do {
				System.out.printf("\nO novo saldo é de: R$ %f", contaEmpresa.getSaldo());
				System.out.println("\n\nDeseja fazer outro empréstimo S/N? ");
				
				resp = scan.next().charAt(0);

				if (resp == 'S' || resp == 's') {
					contaEmpresa.getEmprestimo();
				}
				
			}while(resp == 'S' || resp == 's' );
			
			contaEmpresa();

			break;
		case 2:
			contaEmpresa.debitar();
			do {
				System.out.printf("\nO novo saldo é de: R$ %f", contaEmpresa.getSaldo());
				System.out.println("\n\nDeseja debitar outro valor S/N? ");
				
				resp = scan.next().charAt(0);

				if (resp == 'S' || resp == 's') {
					contaEmpresa.debitar();
				}
				
			}while(resp == 'S' || resp == 's' );
			
			contaEmpresa();
			break;
		case 3:
			contaEmpresa.creditar();
			do {
				System.out.printf("\nO novo saldo é de: R$ %f", contaEmpresa.getSaldo());
				System.out.println("\n\nDeseja creditar outro valor S/N? ");
				
				resp = scan.next().charAt(0);

				if (resp == 'S' || resp == 's') {
					contaEmpresa.creditar();
				}
				
			}while(resp == 'S' || resp == 's' );
			
			contaEmpresa();
			break;
		case 4:
			// this.menu.main();
			break;
		case 5:
			// getExtrato();
			break;
		case 6:
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida!!!");
		}

	}

}
