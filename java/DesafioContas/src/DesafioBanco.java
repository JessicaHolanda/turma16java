import java.util.Scanner;

public class DesafioBanco {

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
		
		switch(conta) {
			case 1:
				
			break;
			
			case 2:
				
			break;
			
			case 3:
				
			break;
			
			case 4:
				ContaEmpresa.main(args);
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

}
