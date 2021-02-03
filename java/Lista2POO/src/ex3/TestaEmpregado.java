package ex3;

import java.util.Scanner;

public class TestaEmpregado {

	public static void main(String[] args) {
		
		Empregado empregado1 = new Empregado("Arya", "Winterfell", "0000-0000", 100);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CALCULO DE SALÁRIO DE FUNCIONARIO");
		
		System.out.printf("\nNome: %s\nEndereço: %s\nTelefone: %s\nCódigo do Setor: %d", empregado1.getNome(), empregado1.getEndereco(), empregado1.getTelefone(), empregado1.getCodigoSetor());
				
		empregado1.setSalarioBase(1000.00);
		empregado1.setImposto(0.10);
		
		System.out.printf("\n\nSalário: R$ %.2f", empregado1.getSalarioBase());
		System.out.printf("\nImposto: %.2f %%", empregado1.getImposto());
		
		empregado1.calcularSalario();

	}
}
