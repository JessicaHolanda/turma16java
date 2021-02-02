package entidade;

public class Pessoa {
	
	public String nome;
	public int anoNascimento;
	public char genero;
	public boolean estaVivo;

	// CONSTRUTORES
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome, boolean estaVivo) {
		this.nome = nome;
		this.estaVivo = estaVivo;
	}

	// METODOS

	public int idade() {
		return 2021 - anoNascimento;
	}
	
	public String statusIdade() {
		int idade = 2021 - anoNascimento;
		String mensagem;
		if (idade <18) {
			mensagem = "Pessoa menor que 18 anos";
			return mensagem;
		} else {
			mensagem = "Pessoa maior que 18 anos";
			return mensagem;
		}
	}
	
	
	public String statusGenero(char genero) {
		String apelido;
		
		if (genero == 'F') {
			apelido = "Sra ";
			return apelido;
		}
		else if (genero == 'm') {
			apelido = "Sr ";
			return apelido;
		}
		else {
			apelido = "Sre ";
			return apelido;
		}
		
	}
	
}
