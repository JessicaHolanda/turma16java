import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		int num, num2;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		num = scan.nextInt();
		if(num % 2 == 0)
			System.out.printf("\nO n�mero � par e sua raiz quadrada �: %f", Math.sqrt(num));
			
		else System.out.printf("\nO n�mero � impar e elevado ao quadrado ele fica: %f", Math.pow(num, 2));
	}
}
