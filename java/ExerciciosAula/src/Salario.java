import java.util.Scanner;

public class Salario {
	/*					PARA
	 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de
	 * seus habitantes, coletando dados sobre o sal�rio e n�mero de
	 * filhos. A prefeitura deseja saber:
	   a) m�dia do sal�rio da popula��o;
	   b) m�dia do n�mero de filhos;
	   c) maior sal�rio;
	   d) percentual de pessoas com sal�rio at� R$100,00
	 */
	
	double salario, mediaSalario, percentual, maiorSalario, totalSalario, mediaFilhos;
	int filhos, qtdFilhos, i, h =5, cont;
	Scanner scan = new Scanner(System.in);
	
	for (i=1; i<=h; i++)
	{
		System.out.println("Insira o Sal�rio: ");
		salario = scan.nextDouble();
		System.out.println("Insira o n�mero de filhos: ");
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
	
	System.out.println("A media salarial �:R$",mediaSalario);
	System.out.println("\nA media de filhos �:");
	System.out.println("\nO maior salario inserido foi:");
	System.out.println("\nNumero de pessoas que ganham at� R$100,00 %d contador, sendo o percentual: %f%", cont, percentualSal);
	


}

}
