import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		int num, soma=0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Digite um n�mero: ");
			num = scan.nextInt();
			soma += num;
		}while(num !=0);
		System.out.printf("\nA soma dos n�meros inseridos �: %d", soma);
	}
}
