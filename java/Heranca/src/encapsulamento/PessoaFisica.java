package encapsulamento;

import java.util.Scanner;

public class PessoaFisica extends Cliente {
	
	private String cpf;
	private double emprestimoPF = 1000.00;
	
	public PessoaFisica(String codCadastro, String dataCadastro, String nome) {
		super(codCadastro, dataCadastro, nome);
	}

	// getters e setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getEmprestimoPF() {
		return emprestimoPF;
	}

	public void setEmprestimoPF(double emprestimoPF) {
		this.emprestimoPF = emprestimoPF;
	}


	public void solicitarEmprestimoPF() {
		Scanner scan = new Scanner(System.in);
		double emprestimo=0.00;
		System.out.println("EMPRESTIMO PESSOA FISICA\n");
		System.out.printf("\nValor disponível para empréstimo %.2f: ", this.emprestimoPF);
		
		System.out.printf("\nDigite o valor do emprestimo até %.2f", this.emprestimoPF);
		emprestimo = scan.nextDouble();
		
		System.out.printf("Emprestimo de %.2f realizado!", emprestimo);
	}
	
}
