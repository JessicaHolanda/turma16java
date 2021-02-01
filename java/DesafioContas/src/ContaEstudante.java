import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaEstudante {

	// Declaração de atributos
	private double saldo;
	private double limiteEstudanteDisp;
	private List<Extrato> extrato = new ArrayList<Extrato>();

	// Função construtor
	public ContaEstudante() { 
		this.setSaldo(0);
		this.setLimiteDisponivel(5000);
	}

	public ContaEstudante(double saldo, double limiteEstudanteDisp) {
		this.setSaldo(saldo);
		this.setLimiteDisponivel(limiteEstudanteDisp);
	}

	// Saldo
	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Emprestimo disponivel
	public double getLimiteDisponivel() {
		return this.limiteEstudanteDisp;
	}

	public void setLimiteDisponivel(double limiteEstudanteDisp) {
		this.limiteEstudanteDisp = limiteEstudanteDisp;
	}

	 // Extrato
		public List<Extrato> getExtrato(){
			return this.extrato;
		}
		
		public void setExtrato(Extrato itemExtrato){
			this.extrato.add(itemExtrato);
		}
		
	// --------------------------------------------------------------------------
	// FUNÇÃO LIMITE ESTUDANTE
	public void limiteEstudante() {
		double valorLimite = 0.00;
		boolean isValid;
		String descricao, transacao = "Limite estudante";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n**********************************************");
		System.out.println("\n\tMENU DE LIMITE ESTUDANTE\n");

			do {
				isValid = true;
				if (this.limiteEstudanteDisp > 0) {
					System.out.printf("Insira o valor do limite até R$ %.2f \n", this.limiteEstudanteDisp);
					valorLimite = scan.nextDouble();

					if (valorLimite > this.limiteEstudanteDisp) {
						System.out.printf("\nVocê possui apenas %.2f disponínel de limite",
								this.limiteEstudanteDisp);
						isValid = false;
					} else {
						this.saldo += valorLimite;
						this.limiteEstudanteDisp -= valorLimite;
						
						System.out.println("Digite A descrição da solicitação: ");
						descricao = scan.nextLine();
						
						Extrato itemExtrato = new Extrato(); 
						itemExtrato.setValor(valorLimite);
						itemExtrato.setTransacao(transacao);
						itemExtrato.setDescricao(descricao);
						
						this.setExtrato(itemExtrato);
		
					}

				} else {
					System.out.println("\nVocê não possui valor disponível de limite\n");
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
		System.out.println("\n**********************************************");
		System.out.println("\tMENU DEBITO\n\n");
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
		System.out.println("\tMENU CREDITO\n\n");
		System.out.printf("Saldo atual: R$ %.2f", this.saldo);

		System.out.println("\nDigite o valor que quer credito: ");
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
