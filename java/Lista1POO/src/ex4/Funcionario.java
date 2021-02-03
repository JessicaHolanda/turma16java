package ex4;

public class Funcionario {
	
	private String nomeFuncionario;
	private int matricula = 100;
	private String cargo;
		
	public Funcionario() {
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public int geraMatricula() {
		this.matricula += 1; 
		return this.matricula;
	}
}
