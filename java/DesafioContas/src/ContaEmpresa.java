import java.util.Scanner;

public class ContaEmpresa {

	public static void main(String[] args) {
		double saldo = 0.00;
		int opcao;
		Scanner scan = new Scanner (System.in);	
		DesafioBanco menu = new DesafioBanco();
		
		System.out.println("CONTA EMPRESARIAL\nBem vindo!\n");
		System.out.printf("Saldo atual: R$ %f \n\n", saldo);
		
		System.out.println("OPÇÕES DISPONIVEIS: ");
		System.out.println("1 - Emprestimo");
		System.out.println("2 - Debitar");
		System.out.println("3 - Creditar");
		System.out.println("4 - Voltar ao menu anterior");
		System.out.println("5 - Sair");
		opcao = scan.nextInt();
		
		switch(opcao) {
		case 1:
			saldo = getEmprestimo(saldo);
			break;
		case 2:
			debitar(saldo);
			break;
		case 3:
			creditar(saldo);
			break;
		case 4:
			DesafioBanco.main(args);
			break;
		case 5:
			System.exit(0);
			break;
			default: 
				System.out.println("Opção inválida!!!");
		}	
	}
	
	//--------------------------------------------------------------------------
	// FUNÇÃO EMPRESTIMO
	public static double getEmprestimo(double saldo) {
		double valorEmprestimo, emprestimoDisponivel = 10000.00, valor;
		Scanner scan = new Scanner (System.in);	
		
		
		System.out.println("\nMENU DE EMPRESTIMO\n");
		System.out.println("Deseja fazer um emprestimo S/N: ");
		char resp = scan.next().charAt(0);
		
		if (resp=='S' || resp =='s') {
			do {
				System.out.println("Insira o valor do empréstimo [Até R$ 10.000]: ");
				valorEmprestimo = scan.nextDouble();
				if (valorEmprestimo <= emprestimoDisponivel) {
					saldo += valorEmprestimo;
				}
			} while (valorEmprestimo > emprestimoDisponivel);
				
			System.out.printf("\nO novo saldo é de: R$ %f", saldo);
			
			System.out.println("\n\nDeseja voltar ao menu anterior S/N? ");
			resp = scan.next().charAt(0);

			if (resp=='S' || resp =='s') {
				ContaEmpresa.main(null);
			}else {
				System.exit(0);
			}
		}
		return saldo;
	}
	//--------------------------------------------------------------------------------
	
	// FUNÇÃO DEBITO

	public static double debitar(double saldo) {
		Scanner scan = new Scanner (System.in);	
		double debito;
		System.out.println("MENU DEBITO\n\n");
		System.out.printf("Saldo atual: ",saldo);
		
		do {
			System.out.println("Digite o valor que quer debitar: ");
			debito = scan.nextDouble();
			
			if(debito < saldo)
				saldo -= debito;
			else 
				System.out.println("Valor maior que o disponível em conta");
		} while(debito > saldo);
		
		return saldo;
	}
	//--------------------------------------------------------------------------------
	
	// FUNÇÃO CRÉDITO
	
	public static double creditar(double saldo) {
		Scanner scan = new Scanner (System.in);	
		double credito;
		System.out.println("MENU CREDITO\n\n");
		System.out.printf("Saldo atual: ",saldo);
		
		System.out.println("Digite o valor que quer debitar: ");
		credito = scan.nextDouble();
		
		saldo += credito;
		
		return saldo;
	}

}
