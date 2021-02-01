import java.util.ArrayList;
import java.util.Scanner;

public class DesafioBanco {

	public static ContaEmpresa contaEmpresa = new ContaEmpresa();
	public static ContaEspecial contaEspecial = new ContaEspecial();
	public static ContaEstudante contaEstudante = new ContaEstudante();
	public static ContaCorrente contaCorrente = new ContaCorrente();
	public static ContaPoupanca contaPoupanca = new ContaPoupanca();

	public static void main(String[] args) {
		int conta;
		Scanner scan = new Scanner(System.in);
		// ContaEmpresa empresa = new ContaEmpresa();

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
			// contaPoupanca();
			break;

		case 2:
			contaCorrente();
			break;

		case 3:
			contaEspecial();
			break;

		case 4:
			contaEmpresa();
			break;

		case 5:
			contaEstudante();
			break;

		case 6:
			System.exit(0);
			break;

		default:
			System.out.println("Opção inválida!");
		}
	}

	// --------------------------------------------------------------------------
	// CONTA EMPRESA
	public static void contaEmpresa() {
		int opcao;
		char resp = 'N';
		Scanner scan = new Scanner(System.in);

		System.out.println("**********************************************");
		System.out.println("CONTA EMPRESARIAL\nBem vindo!\n");
		System.out.printf("Saldo atual: R$ %.2f \n\n", contaEmpresa.getSaldo());

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

			contaEmpresa.emprestimo();

			do {
				System.out.printf("\nO novo saldo é de: R$ %.2f", contaEmpresa.getSaldo());
				System.out.println("\n\nDeseja fazer outro empréstimo S/N? ");

				resp = scan.next().charAt(0);

				if (resp == 'S' || resp == 's') {
					contaEmpresa.emprestimo();

				}

			} while (resp == 'S' || resp == 's');

			contaEmpresa();

			break;
		case 2:
			contaEmpresa.debitar();
			do {
				System.out.printf("\nO novo saldo é de: R$ %.2f", contaEmpresa.getSaldo());
				System.out.println("\n\nDeseja debitar outro valor S/N? ");

				resp = scan.next().charAt(0);

				if (resp == 'S' || resp == 's') {
					contaEmpresa.debitar();
				}

			} while (resp == 'S' || resp == 's');

			contaEmpresa();
			break;
		case 3:
			contaEmpresa.creditar();
			do {
				System.out.printf("\nO novo saldo é de: R$ %.2f", contaEmpresa.getSaldo());
				System.out.println("\n\nDeseja creditar outro valor S/N? ");

				resp = scan.next().charAt(0);

				if (resp == 'S' || resp == 's') {
					contaEmpresa.creditar();
				}

			} while (resp == 'S' || resp == 's');

			contaEmpresa();
			break;
		case 4:
			// this.menu.main();
			break;
		case 5:
			contaEmpresa.showExtrato();
			break;
		case 6:
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida!!!");
		}

	}

	// --------------------------------------------------------------------------
	// CONTA ESPECIAL
	public static void contaEspecial() {
		int opcao;
		char resp = 'N';
		Scanner scan = new Scanner(System.in);

		System.out.println("**********************************************");
		System.out.println("CONTA ESPECIAL\nBem vindo!\n");
		System.out.printf("Saldo atual: R$ %.2f \n\n", contaEmpresa.getSaldo());

		System.out.println("OPÇÕES DISPONIVEIS: ");
		System.out.println("1 - Limite");
		System.out.println("2 - Debitar");
		System.out.println("3 - Creditar");
		System.out.println("4 - Voltar ao menu anterior");
		System.out.println("5 - Exibir extrato");
		System.out.println("6 - Sair");
		opcao = scan.nextInt();

		switch (opcao) {
		case 1:
			contaEspecial.limite();

			do {
				System.out.printf("\nO novo saldo é de: R$ %.2f", contaEspecial.getSaldo());
				System.out.println("\n\nDeseja obter valor de limite novamente S/N? ");

				resp = scan.next().charAt(0);

				if (resp == 'S' || resp == 's') {
					contaEspecial.limite();
				}

			} while (resp == 'S' || resp == 's');

			contaEspecial();

			break;

		case 2:
			contaEspecial.debitar();
			do {
				System.out.printf("\nO novo saldo é de: R$ %.2f", contaEspecial.getSaldo());
				System.out.println("\n\nDeseja debitar outro valor S/N? ");

				resp = scan.next().charAt(0);

				if (resp == 'S' || resp == 's') {
					contaEspecial.debitar();
				}

			} while (resp == 'S' || resp == 's');

			contaEspecial();
			break;
		// CONTA ESPECIAL
		case 3:
			contaEspecial.creditar();
			do {
				System.out.printf("\nO novo saldo é de: R$ %.2f", contaEspecial.getSaldo());
				System.out.println("\n\nDeseja creditar outro valor S/N? ");

				resp = scan.next().charAt(0);

				if (resp == 'S' || resp == 's') {
					contaEspecial.creditar();
				}

			} while (resp == 'S' || resp == 's');

			contaEspecial();
			break;
		case 4:
			// this.menu.main();
			break;
		case 5:
			contaEspecial.showExtrato();
			break;
		case 6:
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida!!!");
		}

	}

	// --------------------------------------------------------------------------
	// CONTA ESTUDANTE
	public static void contaEstudante() {
		int opcao;
		char resp = 'N';
		Scanner scan = new Scanner(System.in);

		System.out.println("**********************************************");
		System.out.println("CONTA ESTUDANTE\nBem vindo!\n");
		System.out.printf("Saldo atual: R$ %.2f \n\n", contaEstudante.getSaldo());

		System.out.println("OPÇÕES DISPONIVEIS: ");
		System.out.println("1 - Limite Estudante");
		System.out.println("2 - Debitar");
		System.out.println("3 - Creditar");
		System.out.println("4 - Voltar ao menu anterior");
		System.out.println("5 - Exibir extrato");
		System.out.println("6 - Sair");
		opcao = scan.nextInt();

		switch (opcao) {
		case 1:
			contaEstudante.limiteEstudante();

			do {
				System.out.printf("\nO novo saldo é de: R$ %.2f", contaEstudante.getSaldo());
				System.out.println("\n\nDeseja obter valor de limite novamente S/N? ");

				resp = scan.next().charAt(0);

				if (resp == 'S' || resp == 's') {
					contaEstudante.limiteEstudante();
				}

			} while (resp == 'S' || resp == 's');

			contaEstudante();

			break;

		case 2:
			contaEstudante.debitar();
			do {
				System.out.printf("\nO novo saldo é de: R$ %.2f", contaEstudante.getSaldo());
				System.out.println("\n\nDeseja debitar outro valor S/N? ");

				resp = scan.next().charAt(0);

				if (resp == 'S' || resp == 's') {
					contaEstudante.debitar();
				}

			} while (resp == 'S' || resp == 's');

			contaEstudante();
			break;

		case 3:
			contaEstudante.creditar();
			do {
				System.out.printf("\nO novo saldo é de: R$ %.2f", contaEstudante.getSaldo());
				System.out.println("\n\nDeseja creditar outro valor S/N? ");

				resp = scan.next().charAt(0);

				if (resp == 'S' || resp == 's') {
					contaEstudante.creditar();
				}

			} while (resp == 'S' || resp == 's');

			contaEstudante();
			break;
		case 4:
			// this.menu.main();
			break;
		case 5:
			contaEstudante.showExtrato();
			break;
		case 6:
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida!!!");
		}

	}

	// --------------------------------------------------------------------------
	// CONTA CORRENTE
	public static void contaCorrente() {
		int opcao;
		char resp = 'N';
		Scanner scan = new Scanner(System.in);

		System.out.println("**********************************************");
		System.out.println("CONTA CORRENTE\nBem vindo!\n");
		System.out.printf("Saldo atual: R$ %.2f \n\n", contaCorrente.getSaldo());

		System.out.println("OPÇÕES DISPONIVEIS: ");
		System.out.println("1 - Talão de cheque");
		System.out.println("2 - Debitar");
		System.out.println("3 - Creditar");
		System.out.println("4 - Voltar ao menu anterior");
		System.out.println("5 - Exibir extrato");
		System.out.println("6 - Sair");
		opcao = scan.nextInt();

		switch (opcao) {
		case 1:
			contaCorrente.taloesCheque();

			do {
				System.out.println("\n\nDeseja obter mais talões de cheque S/N? ");

				resp = scan.next().charAt(0);

				if (resp == 'S' || resp == 's') {
					contaCorrente.taloesCheque();
				}

			} while (resp == 'S' || resp == 's');

			contaCorrente();

			break;

		case 2:
			contaCorrente.debitar();
			do {
				System.out.printf("\nO novo saldo é de: R$ %.2f", contaCorrente.getSaldo());
				System.out.println("\n\nDeseja debitar outro valor S/N? ");

				resp = scan.next().charAt(0);

				if (resp == 'S' || resp == 's') {
					contaCorrente.debitar();
				}

			} while (resp == 'S' || resp == 's');

			contaCorrente();
			break;
		// CONTA ESPECIAL
		case 3:
			contaCorrente.creditar();
			do {
				System.out.printf("\nO novo saldo é de: R$ %.2f", contaCorrente.getSaldo());
				System.out.println("\n\nDeseja creditar outro valor S/N? ");

				resp = scan.next().charAt(0);

				if (resp == 'S' || resp == 's') {
					contaCorrente.creditar();
				}

			} while (resp == 'S' || resp == 's');

			contaCorrente();
			break;
		case 4:
			// this.menu.main();
			break;
		case 5:
			contaCorrente.showExtrato();
			break;
		case 6:
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida!!!");
		}

	}

	// --------------------------------------------------------------------------
	// CONTA POUPANCA
	/*
	 * public static void contaPoupanca() { int opcao; char resp = 'N'; Scanner scan
	 * = new Scanner(System.in);
	 * 
	 * System.out.println("**********************************************");
	 * System.out.println("CONTA POUPANCA\nBem vindo!\n");
	 * System.out.printf("Saldo atual: R$ %.2f \n\n", contaPoupanca.getSaldo());
	 * 
	 * System.out.println("OPÇÕES DISPONIVEIS: "); System.out.println("1 - Limite");
	 * System.out.println("2 - Debitar"); System.out.println("3 - Creditar");
	 * System.out.println("4 - Voltar ao menu anterior");
	 * System.out.println("5 - Exibir extrato"); System.out.println("6 - Sair");
	 * opcao = scan.nextInt();
	 * 
	 * switch (opcao) { case 1: contaPoupanca.limite();
	 * 
	 * do { System.out.printf("\nO novo saldo é de: R$ %.2f",
	 * contaPoupanca.getSaldo());
	 * System.out.println("\n\nDeseja obter valor de limite novamente S/N? ");
	 * 
	 * resp = scan.next().charAt(0);
	 * 
	 * if (resp == 'S' || resp == 's') { contaPoupanca.limite(); }
	 * 
	 * }while(resp == 'S' || resp == 's' );
	 * 
	 * contaPoupanca();
	 * 
	 * break;
	 * 
	 * case 2: contaPoupanca.debitar(); do {
	 * System.out.printf("\nO novo saldo é de: R$ %.2f", contaPoupanca.getSaldo());
	 * System.out.println("\n\nDeseja debitar outro valor S/N? ");
	 * 
	 * resp = scan.next().charAt(0);
	 * 
	 * if (resp == 'S' || resp == 's') { contaPoupanca.debitar(); }
	 * 
	 * }while(resp == 'S' || resp == 's' );
	 * 
	 * contaPoupanca(); break;
	 * 
	 * case 3: contaPoupanca.creditar(); do {
	 * System.out.printf("\nO novo saldo é de: R$ %.2f", contaPoupanca.getSaldo());
	 * System.out.println("\n\nDeseja creditar outro valor S/N? ");
	 * 
	 * resp = scan.next().charAt(0);
	 * 
	 * if (resp == 'S' || resp == 's') { contaPoupanca.creditar(); }
	 * 
	 * }while(resp == 'S' || resp == 's' );
	 * 
	 * contaPoupanca(); break; case 4: // this.menu.main(); break; case 5: //
	 * getExtrato(); break; case 6: System.exit(0); break; default:
	 * System.out.println("Opção inválida!!!"); }
	 * 
	 * }
	 */

	// --------------------------------------------------------------------------
}
