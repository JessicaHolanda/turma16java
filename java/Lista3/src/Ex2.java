import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int i, num, par=0, impar=0;
		Scanner scan = new Scanner(System.in);

		for(i=0; i<10; i++) {
			System.out.println("Digite um n�mero: ");
			num = scan.nextInt();
			if(num % 2 == 0)
				par++;
			else impar++;
		}
		System.out.printf("\nA quantidade de n�meros impares �: %d",impar);
		System.out.printf("\nA quantidade de n�meros pares �: %d",par);
	}
}