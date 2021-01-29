import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int idade=0, menor=0, maior=0;
		Scanner scan = new Scanner(System.in);
		
		while(idade != -99) {
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
			if(idade >0 && idade< 21)
				menor++;
			else if(idade > 50)
				maior++;
		}
		System.out.printf("\nQuantidade de pessoas com menos de 21 anos %d", menor, maior);
		System.out.printf("\nQuantidade de pessoas com mais de 50 anos %d", maior);
	}
}
