import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaPoupanca {

	// Declaração de atributos
	private double saldo;
	private double emprestimoDisponivel;
	private List<Extrato> extrato = new ArrayList<Extrato>();

	// Função construtor
	public ContaPoupanca() { 
		this.setSaldo(0);
		this.setEmprestimoDisponivel(10000);
	}

	public ContaPoupanca(double saldo, double emprestimoDisponivel) {
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
	
	 // Extrato
		public List<Extrato> getExtrato(){
			return this.extrato;
		}
		
		public void setExtrato(Extrato itemExtrato){
			this.extrato.add(itemExtrato);
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
					System.out.printf("Insira o valor do empréstimo até R$ %.2f \n", this.emprestimoDisponivel);
					valorEmprestimo = scan.nextDouble();

					if (valorEmprestimo > this.emprestimoDisponivel) {
						System.out.printf("\nVocê possui apenas %.2f disponínel para emprestimo",
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
		String descricao, transacao = "Débito";
		System.out.println("**********************************************");
		System.out.println("MENU DEBITO\n\n");
		System.out.printf("Saldo atual: R$ %.2f", this.saldo);

		do {
			System.out.println("\nDigite o valor que quer debitar: ");
			debito = scan.nextDouble();

			if (debito < this.saldo) {
				this.saldo -= debito;
				
				System.out.println("Digite A descrição da solicitação: ");
				descricao = scan.nextLine();
				
				Extrato itemExtrato = new Extrato(); 
				itemExtrato.setValor(debito);
				itemExtrato.setTransacao(transacao);
				itemExtrato.setDescricao(descricao);
				
				this.setExtrato(itemExtrato);
				
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
		String descricao, transacao = "Crédito";
		System.out.println("\n**********************************************");
		System.out.println("MENU CREDITO\n\n");
		System.out.printf("Saldo atual: R$ %.2f", this.saldo);

		System.out.println("\nDigite o valor que quer creditar: ");
		credito = scan.nextDouble();

		this.saldo += credito;
		
		System.out.println("Digite A descrição da solicitação: ");
		descricao = scan.nextLine();
		
		Extrato itemExtrato = new Extrato(); 
		itemExtrato.setValor(credito);
		itemExtrato.setTransacao(transacao);
		itemExtrato.setDescricao(descricao);
		
		this.setExtrato(itemExtrato);

	}

	// --------------------------------------------------------------------------------

	// FUNÇÃO EXTRATO

	public void showExtrato() {
		 System.out.println ("\n**********************************************");
		 System.out.println ("Extrato da Conta Empresa\n");
		for (Extrato obj : this.extrato) {
		    System.out.printf ("\nData: %s\t Transação: %s\t Descrição: %s\t Valor: %.2f " , obj.getData() ,  obj.getTransacao() , obj.getDescricao() , obj.getValor());
		}
	}

}
