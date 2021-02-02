package formas;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
	
	private double base;
	private double altura;
	private double area;

	Scanner leia = new Scanner(System.in);// instaciar = criar
	
		/*System.out.printf("\nDigite a base do triangulo: ");
		this.base = leia.nextDouble();
		System.out.printf("\nDigite a altura do triangulo: ");
		this.altura = leia.nextDouble();*/
		public Double area() {
			area = ((base * altura) / 2);
			return area;
		}
		
		
		
		
		

		
}
