import java.util.Random;

public class Ex2vetor {
	public static void main(String[] args) {
		int lancamentos[] = new int[10], soma=0, jogadas=10, maior=0, qtd=0, media;
		Random random = new Random();
		
		System.out.println("LANÇAMENTOS: ");
		for (int i=0; i<jogadas; i++){
			lancamentos[i] = random.nextInt(6) + 1;   
			System.out.printf("%d\t",lancamentos[i]);
		}
				
		for (int i=0; i < jogadas; i++){
			soma += lancamentos[i];

			if (lancamentos[i] >= maior){
				if (lancamentos[i] == maior){
					qtd++;
				} else qtd=1;
				maior = lancamentos[i];
			}
		}
		media = soma / jogadas;
				
		System.out.printf("\n\nA soma dos valores é: %d \nA media dos valores é: %d"+
				"\nA maior pontuação que apareceu foi: %d"+
				"\nA maior pontuação apareceu %d vezes\n", soma, media, maior, qtd);	
	}
}
