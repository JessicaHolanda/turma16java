import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		int num, soma=0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			num = scan.nextInt();
			soma += num;
		}while(num !=0);
		System.out.printf("\nA soma dos números inseridos é: %d", soma);
	}
}
