package ex3;

import ex1.Pessoa;

public class Empregado extends Pessoa{
	
	private int codigoSetor; 
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}

	
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}


	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}


	public double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public void calcularSalario(){
		double salarioCorrigido;
		salarioCorrigido = this.salarioBase - (this.salarioBase * this.imposto);
		
		System.out.printf("\nO salário corrigido é: %.2f", salarioCorrigido);
	}
}
