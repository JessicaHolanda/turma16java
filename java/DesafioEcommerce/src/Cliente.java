
public class Cliente {
	
	private String nomeCliente;
	private char generoCliente;
	private String apelido;
	
	public Cliente(String nomeCliente, char generoCliente) {
		this.nomeCliente = nomeCliente;
		this.generoCliente = generoCliente;
	}

	public Cliente() {
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
	
	public void tratamentoGenero(char genero) {
		if (genero == 'M')
        {
            this.apelido = "Sr. ";
        }
        else if (genero == 'F')
        {
            this.apelido = "Sra. ";
        }
        else  
        {
            this.apelido = "Sre. ";
        }
	}
	
	public String clienteComGenero() {
		return "Bem vinde! " + this.apelido + " " + this.nomeCliente;
	}
	
	
}
