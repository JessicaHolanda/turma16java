package ex4;

import java.util.Scanner;

public class InstanciaFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		Scanner scan = new Scanner(System.in);
		
		String nomeFuncionario;
		String matricula;
		String cargo;
		
		System.out.println("CADASTRO DE NOVOS FUNCIONARIOS\n");
		
		System.out.println("Digite o nome do funcionario: ");
		nomeFuncionario = scan.nextLine();
		funcionario.setNomeFuncionario(nomeFuncionario);
		
		System.out.println("Digite o cargo do funcionario: ");
		cargo = scan.next();
		funcionario.setCargo(cargo);
		
		System.out.printf("A matricula do funcionário é: %d", funcionario.geraMatricula());
	}

}
