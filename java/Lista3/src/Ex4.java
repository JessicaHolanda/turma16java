import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
				
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos, humor, qtd, idade;
		int genero, pessoasNervosas;
		Scanner scan = new Scanner(System.in);
		
		while(qtd <150) {
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
			System.out.println("\nDigite a opção com o gênero que você se identifica");
			System.out.println("1 - feminino");
			System.out.println("2 - masculino");
			System.out.println("3 - outros");
			genero = scan.nextInt();
			
			System.out.println("Informe como está seu humor hoje: ");
			System.out.println("1 - Calmo");
			System.out.println("2 - Nervoso");
			System.out.println("3 - Agressivo");
			humor = scan.nextInt();
			
			
				if (humor == 1)
					pessoasCalmas++;
				
				if (genero == 1 && humor == 2)
					mulheresNervosas++;
				
				if (genero == 2 && humor == 3)
					homensAgressivos++;
				
				if (genero == 3 && humor == 3)
					outrosCalmos++;
				
				if (humor == 2 && idade > 40)
					
				if (humor == 1 && idade < 18)
					
			
				/*switch(genero) {
				case 1:
					(genero == 1? cont++ : null);
				break;
				
				case 2:
					nervosa++;
				break;
					
				case 3:
					agressiva++;
				break;
				}*/
				
		
		System.out.printf("\nNúmero de pessoas calmas: %d", pessoasCalmas);
		System.out.printf("\nNúmero de mulheres nervosas: %d", mulheresNervosas);
		System.out.printf("\nNúmero de homens agressivos: %d", homensAgressivos);
		System.out.printf("\nNúmero de outros calmos: %d", outrosCalmos);
		System.out.printf("\nNúmero de pessoas nervosas com mais de 40 anos: %d", outrosCalmos);
		System.out.printf("\nNúmero de pessoas calmas com menos de 18 anos: %d", outrosCalmos);
	}

}
