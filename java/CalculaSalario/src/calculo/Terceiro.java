package calculo;

public class Terceiro extends Empregado {
	
	protected double acrescimo=0.1;

	public Terceiro(String nome, int matricula, int horas, double valorHora, double acrescimo) {
		super(nome, matricula, horas, valorHora);
		this.acrescimo = acrescimo;
	}

	public Terceiro(String nome, int matricula, double acrescimo) {
		super(nome, matricula);
		this.acrescimo = acrescimo;
	}

	
	public double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}


	@Override
	public double salario() {
		return super.horas* (super.valorHora+(super.valorHora*this.acrescimo));
		
	}
}
