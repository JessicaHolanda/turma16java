import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		double a, b, c, media;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		a = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		b = scan.nextDouble();
		System.out.println("Digite a terceira nota: ");
		c = scan.nextDouble();

		media = (a*2 + b*3 + c*5)/(2+3+5);

		System.out.println("\nA média é: " + media);
	}
}
