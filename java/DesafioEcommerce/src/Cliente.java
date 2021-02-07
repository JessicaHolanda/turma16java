
public class Cliente {
	
	private String nomeCliente;
	private char generoCliente;
	private String apelido;
	
	public Cliente(String nomeCliente, char generoCliente, String apelido) {

		this.nomeCliente = nomeCliente;
		this.generoCliente = generoCliente;
		this.apelido = apelido;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public char getGeneroCliente() {
		return generoCliente;
	}

	public void setGeneroCliente(char generoCliente) {
		this.generoCliente = generoCliente;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	public void tratamentoGenero() {
		
	}
	
	
}
