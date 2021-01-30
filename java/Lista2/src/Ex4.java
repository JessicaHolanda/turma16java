import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		int num, num2;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		num = scan.nextInt();
		if(num % 2 == 0)
			System.out.printf("\nO número é par e sua raiz quadrada é: %f", Math.sqrt(num));
			
		else System.out.printf("\nO número é impar e elevado ao quadrado ele fica: %f", Math.pow(num, 2));
	}
}
