package ex6;

import ex1.Pessoa;

public class Vendedor extends Pessoa {
	
	private double valorVendas;
	private double comissao;
	private double salarioBase;
	
	public Vendedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public void vencimentoBase() {
		this.salarioBase += (this.valorVendas * this.comissao);
		System.out.println(this.salarioBase);
	}
}
