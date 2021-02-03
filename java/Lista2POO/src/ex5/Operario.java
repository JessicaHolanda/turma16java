package ex5;

import ex1.Pessoa;

public class Operario extends Pessoa {
	
	private double valorProducao;
	private double comissao;
	private double salarioBase;
	
	public Operario(String nome, String endereco, String telefone, double valorProducao, double comissao, double salarioBase) {
		super(nome, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		this.salarioBase = salarioBase;
	}
	
	public Operario(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}


	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
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
		this.salarioBase += (this.valorProducao * this.comissao);
	}
}
