import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int i, numero, maior=0;
		Scanner scan = new Scanner(System.in);
		
		for(i=0; i<3;i++) {
			System.out.println("Digite um n�mero: ");
			numero = scan.nextInt();
			
			if(numero>maior) 
				maior = numero;
			
		}
		System.out.format("O maior n�mero �: %d", maior);
	}
}
