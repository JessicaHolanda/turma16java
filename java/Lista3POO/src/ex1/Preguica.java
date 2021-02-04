package ex1;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emitirSom() {
		return "zzZZZz";
	}
	
	public void subirEmArvores() {
	}

}
