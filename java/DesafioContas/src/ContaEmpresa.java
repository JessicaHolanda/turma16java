import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ContaEmpresa {

	// Declaração de atributos
	private double saldo;
	private double emprestimoDisponivel;
	private String descricao;
	private DesafioBanco menu;

	// Função construtor
	public ContaEmpresa() {
		this.setSaldo(0);
		this.setEmprestimoDisponivel(10000);
	}

	public ContaEmpresa(double saldo, double emprestimoDisponivel) {
		this.setSaldo(saldo);
		this.setEmprestimoDisponivel(emprestimoDisponivel);
	}

	// Saldo
	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Emprestimo disponivel
	public double getEmprestimoDisponivel() {
		return this.emprestimoDisponivel;
	}

	public void setEmprestimoDisponivel(double emprestimoDisponivel) {
		this.emprestimoDisponivel = emprestimoDisponivel;
	}

	// --------------------------------------------------------------------------
	// FUNÇÃO EMPRESTIMO
	public void getEmprestimo() {
		double valorEmprestimo = 0.00;
		boolean isValid;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("**********************************************");
		System.out.println("\nMENU DE EMPRESTIMO\n");

			do {
				isValid = true;
				if (this.emprestimoDisponivel > 0) {
					System.out.printf("Insira o valor do empréstimo até R$ %f \n", this.emprestimoDisponivel);
					valorEmprestimo = scan.nextDouble();

					if (valorEmprestimo > this.emprestimoDisponivel) {
						System.out.printf("\nVocê possui apenas %f disponínel para emprestimo",
								this.emprestimoDisponivel);
						isValid = false;
					} else {
						this.saldo += valorEmprestimo;
						this.emprestimoDisponivel -= valorEmprestimo;
		
					}

				} else {
					System.out.println("Você não possui valor disponível para empréstimo\n");
					break;
				}

			} while (isValid == false);		
	}
	// --------------------------------------------------------------------------------

	// FUNÇÃO DEBITO

	public void debitar() {
		Scanner scan = new Scanner(System.in);
		double debito;
		System.out.println("**********************************************");
		System.out.println("MENU DEBITO\n\n");
		System.out.printf("Saldo atual: R$ %f", this.saldo);

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

	// FUNÇÃO CRÉDITO

	public void creditar() {
		Scanner scan = new Scanner(System.in);
		double credito;
		System.out.println("\n**********************************************");
		System.out.println("MENU CREDITO\n\n");
		System.out.printf("Saldo atual: R$ %f", this.saldo);

		System.out.println("\nDigite o valor que quer debitar: ");
		credito = scan.nextDouble();

		this.saldo += credito;

		// addExtrato(descricao, saldo);

	}

	// --------------------------------------------------------------------------------

	// FUNÇÃO EXTRATO

	/*
	 * public String[] addExtrato(String descricao, double saldo) { String extrato[]
	 * = new String[10];
	 * 
	 * Date dataHoraAtual = new Date(); String data = new
	 * SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual); String hora = new
	 * SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
	 * 
	 * for(int i = 0; i < extrato.length; i++) { if(extrato[i] != null) extrato[i] =
	 * System.out.printf("\nHorário da transação: %s \nDescrição: %s \nValor: R$ %f"
	 * , dataHoraAtual, descricao, saldo); } return extrato; }
	 * 
	 * public static getExtrato() {
	 * 
	 * 
	 * }
	 */

}
