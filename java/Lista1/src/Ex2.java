import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		int anos, meses, dias, idade;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias: ");
		idade = scan.nextInt();
		
		anos = idade /365;
		meses = (idade % 365) /30;
		dias = idade % meses;
		
		System.out.format("Sua idade é: %d anos, %d meses e %d dias", anos, meses, dias);
		
	}
}
