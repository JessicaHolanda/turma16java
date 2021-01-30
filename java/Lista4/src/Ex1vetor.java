import java.util.Scanner;

public class Ex1vetor {
	public static void main(String[] args) {
		int pontos[] = new int[5];
		int i, maior=0;
		Scanner scan = new Scanner(System.in);
		
		for(i=0; i<pontos.length;i++) {
			System.out.println("Digite a pontuação: ");
			pontos[i] = scan.nextInt();
			
			if(pontos[i] > maior)
				maior = pontos[i];		
		}
		int j = 1;
		for(int ponto : pontos) {
			System.out.printf("\n pontuacao %d: %d",j, ponto);
			j++;
		}
		System.out.printf("\n\nA maior pontuação foi: %d", maior);
	}
}
