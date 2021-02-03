package encapsulamento;

import java.util.Scanner;

public class PessoaJuridica extends Cliente {
	
	private String cnpj;
	private double emprestimoPJ = 10000.00;

	public PessoaJuridica(String codCadastro, String dataCadastro, String nome) {
		super(codCadastro, dataCadastro, nome);
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getEmprestimoPJ() {
		return emprestimoPJ;
	}

	public void setEmprestimoPJ(double emprestimoPJ) {
		this.emprestimoPJ = emprestimoPJ;
	}

	public void solicitarEmprestimoPJ() {
		Scanner scan = new Scanner(System.in);
		double emprestimo;
		System.out.println("EMPRESTIMO PESSOA JURÍDICA\n");
	
		System.out.printf("\nDigite o valor do emprestimo até %.2f", this.emprestimoPJ);
		emprestimo = scan.nextDouble();
	}
	
	
}
