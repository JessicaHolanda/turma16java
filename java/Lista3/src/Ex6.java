import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		int num, soma=0, qtd=0, media;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Digite um n�mero: ");
			num = scan.nextInt();
			if(num % 3 == 0 && num != 0) {
				soma += num;
				qtd++;
			}
		}while(num != 0);
		
		media = soma / qtd;
		System.out.printf("\nA m�dia dos n�meros multiplos de 3 �: %d", media);
	}
}
