package calculo;

public class Empregado {
	
	protected String nome;
	protected int matricula;
	protected int horas;
	protected double valorHora;
	
	
	public Empregado(String nome, int matricula, int horas, double valorHora) {
		this.nome = nome;
		this.matricula = matricula;
		this.horas = horas;
		this.valorHora = valorHora;
	}


	public Empregado(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double salario() {

		return this.horas*this.valorHora;

	}
	
	
}
