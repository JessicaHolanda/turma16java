import java.util.Scanner;

public class PlacarTimes {
	public static void main(String[] args) {
		String times[] = {"PALMEIRAS", "SFC", "SANTOS", "CORINTHIANS"};
		int pontos[] = new int[4]; 
		int i, j, aux;
		char resultado;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("PAULISTINHA\n");

		for(j=0; j<4; j++){
			System.out.printf("\nRODADA: %d",(j+1));
			for (i=0; i<4; i++){
				System.out.printf("\nO time %s G-ganhou, P-perdeu ou E-empatou? ", times[i]);
				resultado = scan.next().toUpperCase().charAt(0);
			
				if(resultado == 'G')
					pontos[i] = pontos[i] + 3;
				else if(resultado == 'P')
					pontos[i] = pontos[i] + 0;
				else if (resultado == 'E')
					pontos[i] = pontos[i] + 1;
			}
		}
		for(i=0; i<4; i++){
			System.out.printf("\nO time %s fez %d pontos", times[i], pontos[i]);
		}	
		
		
		System.out.println("\nEscolha um time \n1 - PALMEIRAS \n2 - SFC \n3 - SANTOS \n4 - CORINTHIANS");
		aux = scan.nextInt();
		System.out.printf("\nO time %s fez %d pontos",times[aux-1], pontos[aux-1]);
		
	}
}
