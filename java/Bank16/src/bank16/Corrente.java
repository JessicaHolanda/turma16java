package bank16;

public class Corrente extends Conta{
	
	int qtMesTalao;
	
	public Corrente(String numero, String cpf, int qtMesTalao) {
		super(numero, cpf);
		this.qtMesTalao = qtMesTalao;
	}

	public int getQtMesTalao() {
		return qtMesTalao;
	}

	public void setQtMesTalao(int qtMesTalao) {
		this.qtMesTalao = qtMesTalao;
	}
	
	public void emitirTalao(int qtd) {
		System.out.println("**********************************************");
		System.out.println("\n\tMENU TALÕES DE CHEQUE\n");

		this.qtMesTalao -= qtd;
	}
	
}
