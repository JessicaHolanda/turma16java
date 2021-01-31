import java.util.Scanner;

public class ContaEspecial {
	public static void main(String[] args) {
		double saldo = 0.00;
		int opcao;
		String extrato[] = new String[10];
		Scanner scan = new Scanner (System.in);	
		DesafioBanco menu = new DesafioBanco();
		
		System.out.println("CONTA EMPRESARIAL\nBem vindo!\n");
		System.out.printf("Saldo atual: R$ %f \n\n", saldo);
		
		System.out.println("OPÇÕES DISPONIVEIS: ");
		System.out.println("1 - Limite");
		System.out.println("2 - Debitar");
		System.out.println("3 - Creditar");
		System.out.println("4 - Voltar ao menu anterior");
		System.out.println("5 - Exibir extrato");
		System.out.println("6 - Sair");
		opcao = scan.nextInt();
		
		switch(opcao) {
		case 1:
			saldo = getLimite(saldo);
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
	
	// FUNÇÃO LIMITE
		public static double getLimite(double saldo) {
			double valorLimite, limiteDisponivel = 1000.00;
			Scanner scan = new Scanner (System.in);	
			
			
			System.out.println("\nMENU DE LIMITE\n");
			System.out.println("Deseja usar Limite S/N: ");
			char resp = scan.next().charAt(0);
			
			if (resp=='S' || resp =='s') {
				do {
					System.out.println("Insira o valor de limite que deseja usar [Até R$ 1.000]: ");
					valorLimite = scan.nextDouble();
					if (valorLimite <= limiteDisponivel) {
						saldo += valorLimite;
					}
				} while (valorLimite > limiteDisponivel);
					
				System.out.printf("\nO novo saldo é de: R$ %f", saldo);
				
				System.out.println("\n\nDeseja voltar ao menu anterior S/N? ");
				resp = scan.next().charAt(0);

				if (resp=='S' || resp =='s') {
					ContaEspecial.main(null); 
				}else {
					System.exit(0);
				}
			}
			return saldo;
		}
}
