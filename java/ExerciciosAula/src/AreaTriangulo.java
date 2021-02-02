import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US); //define o tipo de padronização
		//area = base * altura / 2
		Scanner leia = new Scanner(System.in);//instaciar = criar
		double base, altura, area, maiorArea= 0.0;
		int aux=0;
		
		for(int i=1; i<=3; i++) {
			System.out.printf("\nDigite a base do triangulo %d: ", i);
			base = leia.nextDouble();
			System.out.printf("\nDigite a altura do triangulo %d: ", i);
			altura = leia.nextDouble();
			
			area = ((base * altura) / 2 );
			
			if(area > maiorArea) {
				maiorArea = area;
				aux = i;
			}
			
			System.out.printf("\nA area do triangulo informado é %.2f", area);
		}
		System.out.println("\n\n**********************************************************");
		System.out.printf("O triangulo com maior area é: %d \nE sua area é: %f\n", aux, maiorArea);
	}

}
