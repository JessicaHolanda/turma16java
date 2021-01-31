import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ContaEmpresa {

	// Declara��o de atributos
	private double saldo;
	private double emprestimoDisponivel;
	private String descricao;
	private DesafioBanco menu;

	// Fun��o construtor
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
	// FUN��O EMPRESTIMO
	public void getEmprestimo() {
		double valorEmprestimo = 0.00;
		boolean isValid;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("**********************************************");
		System.out.println("\nMENU DE EMPRESTIMO\n");

			do {
				isValid = true;
				if (this.emprestimoDisponivel > 0) {
					System.out.printf("Insira o valor do empr�stimo at� R$ %f \n", this.emprestimoDisponivel);
					valorEmprestimo = scan.nextDouble();

					if (valorEmprestimo > this.emprestimoDisponivel) {
						System.out.printf("\nVoc� possui apenas %f dispon�nel para emprestimo",
								this.emprestimoDisponivel);
						isValid = false;
					} else {
						this.saldo += valorEmprestimo;
						this.emprestimoDisponivel -= valorEmprestimo;
		
					}

				} else {
					System.out.println("Voc� n�o possui valor dispon�vel para empr�stimo\n");
					break;
				}

			} while (isValid == false);		
	}
	// --------------------------------------------------------------------------------

	// FUN��O DEBITO

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
				System.out.println("\nValor maior que o dispon�vel em conta");
			}
				
		} while (debito > this.saldo);
		
		
	}
	// --------------------------------------------------------------------------------

	// FUN��O CR�DITO

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

	// FUN��O EXTRATO

	/*
	 * public String[] addExtrato(String descricao, double saldo) { String extrato[]
	 * = new String[10];
	 * 
	 * Date dataHoraAtual = new Date(); String data = new
	 * SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual); String hora = new
	 * SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
	 * 
	 * for(int i = 0; i < extrato.length; i++) { if(extrato[i] != null) extrato[i] =
	 * System.out.printf("\nHor�rio da transa��o: %s \nDescri��o: %s \nValor: R$ %f"
	 * , dataHoraAtual, descricao, saldo); } return extrato; }
	 * 
	 * public static getExtrato() {
	 * 
	 * 
	 * }
	 */

}
