package trycatch;

import java.util.Scanner;

public class TestesErro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

			try
			{	
				System.out.println("Digite uma sequencia de nomes:");
				String[] vetor = leia.nextLine().split(" ");//{"ed","rafao","milton"}
				System.out.println("Digite uma posição da lista: ");
				int posicao = leia.nextInt();
				System.out.println("O nome na posição escolhida é "+vetor[posicao]);
			}
			catch (java.lang.Exception erro)
			{
				System.out.println("Amigão, tu digitou um tamanho de indice errado!!!");
			}
			finally
			{
				System.out.println("Fim dos testes de erro!");
			}
	
			System.out.println("Fim de programa!!!!");
		}
		
	}

	
	

