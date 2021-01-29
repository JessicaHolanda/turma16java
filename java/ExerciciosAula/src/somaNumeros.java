import java.util.Scanner;

public class somaNumeros{
	public static void main(String[] args) {
		int numero, soma=0, cont=1;
		Scanner scan = new Scanner(System.in);
				
			System.out.println("Digite um numero: ");	
			numero = scan.nextInt();
				
				do{
					soma = soma + cont;
					cont ++;
					
				}while(cont <= numero);

				System.out.format("A soma é: %d", soma);
	}
}
