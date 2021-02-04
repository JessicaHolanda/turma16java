package ex1;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emitirSom() {
		return "Latido!";
	}
	
	public void correr() {
	}
}
