
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static Map<String, Produto> productMap = new HashMap<String, Produto>();
	public static Carrinho carrinho = new Carrinho();
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n--------------------------------------------------------------------------------");
		System.out.println("\t\t\tLIVRARIA ");
		System.out.println("--------------------------------------------------------------------------------");
		mostraLista();
		System.out.println("\nDigite a opção desejada: ");
		System.out.println("1 - Adicionar ao carrinho ");
		System.out.println("2 - Mostrar carrinho");
		System.out.println("3 - Atualizar estoque");
		System.out.println("4 - Apresentar todos os dados");
		System.out.println("5 - Sair");
		int op = scan.nextInt();

		switch (op) {
		case 1:
			adicionarProdCarrinho();
			break;
		case 2:
			carrinho.mostraCarrinho();
			main(null);
			break;
		case 3:
			estoque();
			break;
		case 4:
			mostraLista();
			main(null);
			break;

		}
	}

	// --------------------------------------------------------------------------------

	public static void adicionarProdCarrinho() {

		System.out.println("Digite o código do produto que deseja adicionar: ");
		String cod = scan.next();
		
		if (productMap.containsKey(cod)) {
			System.out.println("Digite a quantidade que deseja adicionar: ");
			int qtd = scan.nextInt();
			
			if(qtd < productMap.get(cod).getQtdProduto()) {
				int aux = productMap.get(cod).getQtdProduto();
				productMap.get(cod).setQtdProduto(aux - qtd);
				
				ItemCarrinho itemCarrinho = new ItemCarrinho(productMap.get(cod), qtd);

				carrinho.addItemCarrinho(itemCarrinho);
				
				}
			}
			
		main(null);	
		
	}
	

	
	// --------------------------------------------------------------------------------

	public static void remover() {

		
		String exclui;

		mostraLista();

		System.out.println("\n\nDigite o código do produto que deseja excluir: ");
		exclui = scan.next();

		if (productMap.containsKey(exclui)) {
			productMap.remove(exclui);
		}

		mostraLista();

		main(null);
		// System.out.printf("\nCódigo não encontrado!");
	}

	// --------------------------------------------------------------------------------

	public static void atualizaDados() {

		mostraLista();

	}

	// --------------------------------------------------------------------------------

	public static void mostraLista() {

		for (Produto aux : productMap.values()) {
			System.out.println(aux.toString());
		}
	}

	// --------------------------------------------------------------------------------

	public static void estoque() {

		if (productMap.isEmpty()) {

			for (int i = 1; i <= 10; i++) {
				Produto prod = new Produto("0" + i, "Livro " + i, 10, 10.00 + i);
				productMap.put("0" + i, prod);
			}
			System.out.println("Estoque atualizado!\n");
		}

		main(null);

	}

	// --------------------------------------------------------------------------------

}
