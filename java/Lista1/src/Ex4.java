import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		int a, b, c, r, s, d;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = scan.nextInt();
		System.out.println("Digite o valor de B: ");
		b = scan.nextInt();
		System.out.println("Digite o valor de C: ");
		c = scan.hashCode();

		r = (a+b)^2;
		s = (b+c)^2;

		d = ((r+s)/2);

		System.out.format("\nO resultado da expreção é: ", d);
	}

}
