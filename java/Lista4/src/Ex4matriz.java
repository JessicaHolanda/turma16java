import java.util.Random;

public class Ex4matriz {
	public static void main(String[] args) {
		int matriz[][] = new int[3][3], i, j, somaMatriz=0, somaDiagonal=0;
		Random random = new Random();

				// *********  CRIANDO MATRIZ   *********
				for(i=0; i<3; i++){
					
					for(j=0; j<3; j++){
						matriz[i][j] = random.nextInt(9) + 1;
					}
				}

				//***********  EXIBINDO A MATRIZ  *********
				for (int[] m : matriz){
					for(int n : m){
					System.out.printf("[%d]", n);
					}
					System.out.println();
				}
								
				//************* SOMA DOS ELEMENTOS E DA DIAGONAL DA MATRIZ *********
				for(i=0; i<3; i++){
					for(j=0; j<3; j++){
						somaMatriz += (matriz[i][j]);
						if(i == j)
							somaDiagonal += matriz[i][j];
					}
				}
				System.out.printf("\nA soma dos elementos da Matriz é: %d", somaMatriz);
				System.out.printf("\n\nA soma dos elementos da Diagonal da Matriz é: %d", somaDiagonal, "\n");
	}
}
