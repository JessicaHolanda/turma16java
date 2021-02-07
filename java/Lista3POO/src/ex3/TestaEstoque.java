package ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestaEstoque {
	
	public static List<Estoque> estoque = new ArrayList<Estoque>();

	public static void main(String[] args) {
		
		System.out.println("\n\n CADASTRO ESTOQUE\n\n");
		System.out.println("\n1 - Armazenar dados ");
		System.out.println("2 - Remover dados");
		System.out.println("3 - Atualizar dados");
		System.out.println("4 - Apresentar todos os dados");
		System.out.println("5 - Sair");
		
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
		case 4: 
			mostraLista();
			break;
		
		}
		
	}
	
	// --------------------------------------------------------------------------------
	
	public static void armazenar() {
		
		Scanner scan = new Scanner(System.in);
		String cod, descricao;
		double valor;
		int qtd;
		
		System.out.println("\nDigite o código do produto: ");
		cod = scan.next();
		System.out.println("Digite a descrição do produto: ");
		descricao = scan.next();
		System.out.println("Digite o valor do produto: ");
		valor = scan.nextDouble();
		System.out.println("Digite a quantidade do produto que quer armazenar: ");
		qtd = scan.nextInt();
		
		Estoque prod = new Estoque();
		
		prod.setCodProduto(cod);
		prod.setDescricaoProduto(descricao);
		prod.setValorProduto(valor);
		prod.setQtdProduto(qtd);
		estoque.add(prod);
		
		System.out.println("\nProduto cadastrado!\n\n");
		
		mostraLista();
		
		main(null);
	}
	
	// --------------------------------------------------------------------------------
	
	public static void remover() {
		
		Scanner scan = new Scanner(System.in);
		String exclui;

		mostraLista();
		
		System.out.println("\n\nDigite o código do produto que deseja excluir: ");
		exclui = scan.next();
		
		Iterator<Estoque> itr =estoque.iterator();
		while(itr.hasNext()){
			Estoque produto = itr.next();
			if(produto.getCodProduto().equals(exclui)){
				itr.remove();
				System.out.println("teste");
		}
	}
		
		mostraLista();
		
		main(null);
		//System.out.printf("\nCódigo não encontrado!");
	}
	
	// --------------------------------------------------------------------------------
	
	public static void atualizaDados() {
		
		mostraLista();
		
		
	}
	
	
	
	// --------------------------------------------------------------------------------
	
	public static void mostraLista() {
		
		for (Estoque aux : estoque) {
			System.out.println(aux.toString());
		}
	}
	
	
	// --------------------------------------------------------------------------------
	
	
	
}
