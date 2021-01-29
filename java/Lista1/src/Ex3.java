import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		int horas, minutos, segundos, inicial;
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite o tempo em segundos: ");
		inicial = scan.nextInt();

		horas = inicial/3600;
		minutos = (inicial % 3600) /60;
		segundos = inicial % minutos;
		
		System.out.format("A duração do evento é: %d horas, %d minutos e %d segundos", horas, minutos, segundos);

	}
}
