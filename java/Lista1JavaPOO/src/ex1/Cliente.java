package ex1;

public class Cliente {

	public String nomeCliente;
	public char generoCliente;
	public int anoNascimento;
	public String data;
	
	public Cliente() {
	}
	
	public int idadeAprox() {
		return 2021 - anoNascimento;
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
