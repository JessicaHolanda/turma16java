package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaEstoque {
	
	public static Estoque prod1 = new Estoque();
	public static List<Estoque> estoque = new ArrayList<Estoque>();

	public static void main(String[] args) {
		
		System.out.println("1 - Armazenar dados ");
		System.out.println("2 - Remover dados");
		System.out.println("3 - Atualizar dados");
		System.out.println("4 - Apresentar todos os dados");
		
		Scanner scan = new Scanner(System.in);
		int op;
		
		System.out.println("Digite a opção desejada: ");
		op = scan.nextInt();
		
		switch (op) {
		case 1:
			armazenar();
			break;
		case 2:
			remover();
			break;
		case 3:
			break;
		
		}
		
	}
	
	// --------------------------------------------------------------------------------
	
	public static void armazenar() {
		
		Scanner scan = new Scanner(System.in);
		String cod, descricao;
		double valor;
		int qtd;
		
		System.out.println("Digite o código do produto: ");
		cod = scan.next();
		System.out.println("Digite a descrição do produto: ");
		descricao = scan.next();
		System.out.println("Digite o valor do produto: ");
		valor = scan.nextDouble();
		System.out.println("Digite a quantidade do produto que quer armazenar: ");
		qtd = scan.nextInt();
		
		prod1.setCodProduto(cod);
		prod1.setDescricaoProduto(descricao);
		prod1.setValorProduto(valor);
		prod1.setQtdProduto(qtd);
		
		System.out.println("Produto cadastrado!");
	}
	
	// --------------------------------------------------------------------------------
	
	public static void remover() {
		
		Scanner scan = new Scanner(System.in);
		String exclui;

		for (Estoque aux : estoque) {
			System.out.printf("Código: %s\t Descrição: %s\t Valor: R$ %.2f \t Quantidade: %d", aux.getCodProduto(), aux.getDescricaoProduto(), aux.getValorProduto(), aux.getQtdProduto());
		}
		
		System.out.println("Digite o código do produto que deseja excluir: ");
		exclui = scan.next();
		
		
		for (Estoque o : estoque) {
			remove(o.getCodProduto()== exclui ? o==null : o.equals(e));
		}
		
		
		
		
		
	}
	
	
	
}
