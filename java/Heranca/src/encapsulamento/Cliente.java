package encapsulamento;

public class Cliente {
	
	private String codCadastro;
	private String dataCadastro;
	private String nome;
	
	public Cliente(String codCadastro, String dataCadastro, String nome) {
		super();
		this.codCadastro = codCadastro;
		this.dataCadastro = dataCadastro;
		this.nome = nome;
	}
	
	//getters e setters
	public String getCodCadastro() {
		return codCadastro;
	}


	public void setCodCadastro(String codCadastro) {
		this.codCadastro = codCadastro;
	}


	public String getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Metodos
	public void realizarCadastro() {
		
	}
	
	public void atualizarCadastro() {
		
	}
}
