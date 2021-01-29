import java.util.Scanner;

public class Salario {
	/*					PARA
	 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de
	 * seus habitantes, coletando dados sobre o salário e número de
	 * filhos. A prefeitura deseja saber:
	   a) média do salário da população;
	   b) média do número de filhos;
	   c) maior salário;
	   d) percentual de pessoas com salário até R$100,00
	 */
	
	double salario, mediaSalario, percentual, maiorSalario, totalSalario, mediaFilhos;
	int filhos, qtdFilhos, i, h =5, cont;
	Scanner scan = new Scanner(System.in);
	
	for (i=1; i<=h; i++)
	{
		System.out.println("Insira o Salário: ");
		salario = scan.nextDouble();
		System.out.println("Insira o número de filhos: ");
		filhos = scan.nextInt();
		
		totalSalario += salario;
		//totalFil=totalFil+
			
		qtdFilhos += filhos;
				
		if (salario > maiorSalario){
			maiorSalario = salario;
		}
		
		if (salario <= 100){
			cont++;
		}
		
	}
	mediaSalario = totalSalario/h;
	mediaFilhos = qtdFilhos/h;
	percentual = (cont/h)*100;
	
	System.out.println("A media salarial é:R$",mediaSalario);
	System.out.println("\nA media de filhos é:");
	System.out.println("\nO maior salario inserido foi:");
	System.out.println("\nNumero de pessoas que ganham até R$100,00 %d contador, sendo o percentual: %f%", cont, percentualSal);
	


}

}
