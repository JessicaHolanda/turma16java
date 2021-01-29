import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		int a, b, c, d, e, f, x, y;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = scan.nextInt();
		System.out.println("Digite o valor de B: ");
		b = scan.nextInt();
		System.out.println("Digite o valor de C: ");
		c = scan.nextInt();
		System.out.println("Digite o valor de D: ");
		d = scan.nextInt();
		System.out.println("Digite o valor de E: ");
		e = scan.nextInt();
		System.out.println("Digite o valor de F: ");
		f = scan.nextInt();
 
		x = ((c*e)-(b*f)) / ((a*e)-(b*d));

		y = ((a*f)-(c*d)) / ((a*e)-(b*d));
		
		System.out.format("\n O valor de X é: %d\n O valor Y é: %d", x, y);

	}
}
