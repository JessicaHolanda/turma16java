import java.util.Random;

public class Ex3matriz {
	public static void main(String[] args) {
		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6], i, j;
		Random random = new Random();
		
		// ********* CRIANDO MATRIZ N1
		for(i=0; i<4; i++){
			for(j=0; j<6; j++){
				N1[i][j] = random.nextInt(9) + 1;
			}
		}
		
		//***********  CRIANDO MATRIZ N2
		for(i=0; i<4; i++){
			for(j=0; j<6; j++){
				N2[i][j] = random.nextInt(9) + 1;
			}
		}
		
		// ********* EXIBINDO MATRIZ N1
		System.out.println("\nMATRIZ N1: ");
		for(i=0; i<4; i++){
			for(j=0; j<6; j++){
				System.out.printf("[%d]", N1[i][j]);
			}
			System.out.println();
		}	
		// ********* EXIBINDO MATRIZ N2
		System.out.println("\nMATRIZ N2: ");
		for(i=0; i<4; i++){
			for(j=0; j<6; j++){
				System.out.printf("[%d]", N2[i][j]);
			}
			System.out.println();
		}

		//************* SOMA DAS MATRIZES N1 E N2 = M1
		System.out.println("\nMATRIZ M1 (N1+N2): ");
		for (i=0; i<4; i++) {
            for(j=0; j<6; j++) {
                M1[i][j] = N1[i][j] + N2[i][j];
                System.out.printf("[%d]", M1[i][j]);
            }
            System.out.println();
        }
		//************* SUBTRAÇÃO DAS MATRIZES N1 E N2 = M2
		System.out.println("\nMATRIZ M2 (N1-N2): ");
			for (i=0; i<4; i++) {
		         for(j=0; j<6; j++) {
		             M2[i][j] = N1[i][j] - N2[i][j];
		             System.out.printf("[%d]", M2[i][j]);
		            }
		            System.out.println();
		        }
	}
}
