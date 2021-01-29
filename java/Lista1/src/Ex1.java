import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		int anos, meses, dias, resultado;
		Scanner scan = new Scanner(System.in);
				
				System.out.print("Digite sua idade em anos: ");
				anos = scan.nextInt();
				System.out.print("Digite sua idade em meses: ");
				meses = scan.nextInt();
				System.out.print("Digite sua idade em dias: ");
				dias = scan.nextInt();

				resultado = ((anos*365)+(meses*30)+dias);

				System.out.print ("O resultado é: " + resultado);
	}
}
