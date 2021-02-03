package ex2;

import ex1.Pessoa;

public class Fornecedor extends Pessoa{

	private double valorCredito;
	private double valorDivida;
	
	// Construtores
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public Fornecedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}

	// Getters and setters
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	// Metodos
	
	public void obterSaldo() {
		double diferenca;
		diferenca = this.valorCredito - this.valorDivida;
		System.out.printf("\n\nA diferença entre os valores é: R$ %.2f", diferenca);
	}
}
