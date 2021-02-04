package ex2;

import ex1.Animal;
import ex1.Cachorro;
import ex1.Cavalo;
import ex1.Preguica;

public class Fazendinha {

	public static void main(String[] args) {
		
		Cachorro cao1 = new Cachorro("Dany", 3);
		Cavalo cavalo1 = new Cavalo("Harry", 5);
		Preguica preguica1 = new Preguica("Sawako", 6);
		
		Animal[] animais = new Animal[3];
		animais[0] = cao1;
		animais[1] = cavalo1;
		animais[2] = preguica1;
		
		for(Animal animal:animais) {
			System.out.println(animal.emitirSom() );
		}
	}

}
