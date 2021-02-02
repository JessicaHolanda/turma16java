package ex6;

import java.util.Scanner;

public class ContaBancaria {

	private String tipoConta;
	private Double saldo = 1000.00;
	
	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getTipoConta() {
		return this.tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	
	// --------------------------------------------------------------------------------
	public void debitar() {
		Scanner scan = new Scanner(System.in);
		double debito;
		String descricao, transacao = "Débito";
		System.out.println("**********************************************");
		System.out.println("MENU DEBITO\n\n");
		System.out.printf("Saldo atual: R$ %.2f", this.saldo);

		do {
			System.out.println("\nDigite o valor que quer debitar: ");
			debito = scan.nextDouble();

			if (debito < this.saldo) {
				this.saldo -= debito;
								
				break;
			} else {
				System.out.println("\nValor maior que o disponível em conta");
			}
				
		} while (debito > this.saldo);
	}
	// --------------------------------------------------------------------------------

		public void creditar() {
			Scanner scan = new Scanner(System.in);
			double credito;
			String descricao, transacao = "Crédito";
			System.out.println("\n**********************************************");
			System.out.println("MENU CREDITO\n\n");
			System.out.printf("Saldo atual: R$ %.2f", this.saldo);

			System.out.println("\nDigite o valor que quer creditar: ");
			credito = scan.nextDouble();

			this.saldo += credito;
			
			System.out.println("Digite A descrição da solicitação: ");
			descricao = scan.nextLine();
		}
		// --------------------------------------------------------------------------------
}
	
	
