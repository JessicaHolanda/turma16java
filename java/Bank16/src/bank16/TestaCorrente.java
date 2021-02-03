package bank16;

import java.util.Scanner;

public class TestaCorrente {

	public static void main(String[] args) {
		
		Corrente corrente1 = new Corrente("010101-1", "111.111.111-11", 3);
		
		int qtd = 0;
		boolean isValid;
		Scanner scan = new Scanner(System.in);
		
		// --------------------------------------------------------------------------
		
		do {
			isValid = true;
			if (corrente1.getQtMesTalao() > 0) {
				System.out.printf("Quantos tal�es voc� deseja emitir? %d dispon�veis\n", corrente1.getQtMesTalao());
				qtd = scan.nextInt();

				if (qtd > corrente1.getQtMesTalao()) {
					System.out.printf("\nVoc� possui apenas %d de tal�es dispon�veis",
							corrente1.qtMesTalao);
					isValid = false;
				} else {
					corrente1.emitirTalao(qtd);
				}
			} else {
				System.out.println("Voc� j� atingiu o limite de tal�es para a sua conta\n");
				break;
			}

		} while (isValid == false);	
		// --------------------------------------------------------------------------
	}

}
