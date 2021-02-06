package calculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaEmpregado {

	public static void main(String[] args) {
		
		List <Empregado> listaEmpregados = new ArrayList<>();
		List <Terceiro> listaTerceiros = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		String nome;
		int matricula, qtdHoras;
		double valorHora, acrescimo;
		char confirmaTerceiro;
		
		System.out.println("O funcionário é terceiro S/N? ");
		confirmaTerceiro = scan.next().toUpperCase(null).charAt(0);
		
		System.out.println("Digite o nome do funcionário: ");
		nome = scan.nextLine();
		System.out.println("Qual a matricula do funcionario?");
		matricula = scan.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		qtdHoras = scan.nextInt();
		System.out.println("Digite o valor pago por hora: ");
		valorHora = scan.nextDouble();
		
		if (confirmaTerceiro == 'S') {
			System.out.println("Digite a porcentagem de acrescimo: ");
			acrescimo = scan.nextDouble();
			Terceiro ter1 = new Terceiro(nome, matricula, qtdHoras, valorHora, acrescimo);
			
			
		} else {
			
			Empregado emp1 = new Empregado(nome, matricula, qtdHoras, valorHora);
		}
		
			
	}
}
