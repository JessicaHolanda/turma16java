import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		double x1, x2, y1, y2, d, aux;
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite o valor de x1: ");
		x1 = scan.nextDouble();
		System.out.println("Digite o valor de x2: ");
		x2 = scan.nextDouble();
		System.out.println("Digite o valor de y1: ");
		y1 = scan.nextDouble();
		System.out.println("Digite o valor de y2: ");
		y2 = scan.nextDouble();
					
		aux = Math.pow((x2-x1),2) + Math.pow((y2-y1), 2);
			
		d = Math.sqrt(aux);

		System.out.format("A distância entre os dois pontos é: %f", d);
	}
}
