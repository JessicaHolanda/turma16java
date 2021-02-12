
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static Map<String, Produto> productMap = new HashMap<String, Produto>();
	public static Carrinho carrinho = new Carrinho();
	public static Pagamento pagamento = new Pagamento();
	public static Cliente cliente = new Cliente();
	public static Scanner scan = new Scanner(System.in);

	
	public static void main(String[] args) {
		
	if (productMap.isEmpty()) {

			for (int i = 1; i <= 10; i++) {
				Produto prod = new Produto("0" + i, "Livro " + i, 10, 10.00 + i);
				productMap.put("0" + i, prod);
			}
		}
		
		if(cliente.getNomeCliente() == null) {
			cliente();
		}
		System.out.println();

		Scanner scan = new Scanner(System.in);
		System.out.println("\n------------------------------------------------------------------------");
		cliente();
		System.out.println("\t\t\tLIVRARIA BOOKPLUS");
		System.out.println("------------------------------------------------------------------------");
		mostraLista();
		System.out.println("\nDIGITE A OPÇÃO DESEJADA: ");
		System.out.println("1 - Adicionar ao carrinho ");
		System.out.println("2 - Mostrar carrinho");
		System.out.println("3 - Remover Item de carrinho");
		System.out.println("4 - Atualizar carrinho");
		System.out.println("5 - Pagamento");
		System.out.println("6 - Renovar estoque");
		System.out.println("7 - Estoque Atual");
		System.out.println("8 - Sair");
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
			removerProdutoCarrinho();
		case 4:
			atualizarCarrinho();
			break;
		case 5:
			pagamento();
			break;
		case 6:
			estoque();
			break;
		case 7:
			mostraLista();
			main(null);
			break;
		case 8:
			atualizarEstoque();
			main(null);
			break;
		}
	}

	// --------------------------------------------------------------------------------

	public static void adicionarProdCarrinho() {

		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\t\tADICIONAR PRODUTO AO CARRINHO");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Digite o código do produto que deseja adicionar: ");
		String cod = scan.next();
		
		if (productMap.containsKey(cod)) {
			System.out.println("Digite a quantidade que deseja adicionar: ");
			int qtd = scan.nextInt();
			
			if(qtd <= productMap.get(cod).getQtdProduto()) {
				ItemCarrinho itemCarrinho = new ItemCarrinho(productMap.get(cod), qtd);
				carrinho.addItemCarrinho(itemCarrinho);
				}
			}
		
		main(null);	
	}
	
	// --------------------------------------------------------------------------------

	public static void removerProdutoCarrinho() {
		
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\t\tREMOVER PRODUTO DO CARRINHO");
		System.out.println("------------------------------------------------------------------------");
		String cod;
		System.out.println("\n\nDigite o código do produto que deseja excluir: ");
		cod = scan.next();
		if (productMap.containsKey(cod)) {
				carrinho.removerItemCarrinho(cod);
		} 
		else {
			System.out.println("Código inválido!");
		}
		main(null);
	}

	// --------------------------------------------------------------------------------

	public static void atualizarCarrinho() {
		
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\t\tATUALIZAR CARRINHO");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Digite o código do produto que deseja alterar: ");
		String cod = scan.next();
		
		if (productMap.containsKey(cod)) {
			System.out.println("Digite a quantidade que deseja do produto: ");
			int qtd = scan.nextInt();
			
			if(qtd <= productMap.get(cod).getQtdProduto()) {
				
				ItemCarrinho itemCarrinho = new ItemCarrinho(productMap.get(cod), qtd);
				carrinho.addItemCarrinho(itemCarrinho);
			} 
			else {
					System.out.println("Quantidade informada inválida, valor disponível em estoque: %d"+ productMap.get(cod).getQtdProduto());
			}
		} else System.out.println("Código inválido!");

		main(null);	
	}

	// --------------------------------------------------------------------------------
	
	
	public static void pagamento() {
		NotaFiscal notaFiscal = new NotaFiscal();
		double aVista = (carrinho.getSubTotal() - (0.1*carrinho.getSubTotal()));
		double cartao1 = carrinho.getSubTotal();
		double cartao2 = (carrinho.getSubTotal() +  (0.1* carrinho.getSubTotal())) /2; 
		double cartao3 = (carrinho.getSubTotal() +  (0.15* carrinho.getSubTotal())) /3;
		
		pagamento.setCarrinho(carrinho);
		
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\n\t\tOPÇÕES DE PAGAMENTO");
		System.out.printf("\nA VISTA - 10%% DESCONTO [ R$ %.2f ]", aVista);
		System.out.printf("\nCARTÃO - 1 VEZ VALOR NORMAL - SEM DESCONTO R$ %.2f", cartao1);
		System.out.printf("\nCARTÃO - 2 VEZES [ PARCELAS COM JUROS DE 10%% - R$ %.2f por parcela]", cartao2);
		System.out.printf("\nCARTÃO - 3 VEZES [ PARCELAS COM JUROS DE 15%% - R$ %.2f por parcela]", cartao3);
		
		System.out.println("\n------------------------------------------------------------------------");
	
		System.out.println("\nSelecione a opção de pagamento desejada: ");
		System.out.println("1 - A vista");
		System.out.println("2 - Cartão");
		System.out.println("3 - Voltar");
		
		int op = scan.nextInt();
		switch(op){
		case 1:
			pagamento.pagarAVista();
		
			notaFiscal.setCliente(cliente); 
			notaFiscal.setPagamento(pagamento); 
			
			break;
	// --------------------------------------------------------------------------------			
		case 2:
		
			int parcelas;
			do {
				System.out.println("Digite a quantidade de parcelas: ");
				parcelas = scan.nextInt();
				pagamento.pagarCartao(parcelas);
			}while(parcelas < 0 || parcelas > 3);
			
			notaFiscal.setCliente(cliente); 
			notaFiscal.setPagamento(pagamento); 
			
			break;
	// --------------------------------------------------------------------------------
		case 3:
			main(null);
			break;
		}
		
		System.out.printf("\nPagamento concluído!");
		
		notaFiscal.verNota();
		
		atualizarEstoque();
		
		main(null);
	}
	
	

	// --------------------------------------------------------------------------------

	public static void mostraLista() {
		
		System.out.println("\t\tPRODUTOS DISPONÍVEIS: \n");
		System.out.println("CODIGO\t DESCRICAO\tQUANTIDADE\t PREÇO UNITARIO");
		for (Produto aux : productMap.values()) {
			System.out.println(aux.toString());
		}
		System.out.println("------------------------------------------------------------------------");
	}

	// --------------------------------------------------------------------------------

	public static void estoque() {

		if (productMap.isEmpty()) {

			for (int i = 1; i <= 10; i++) {
				Produto prod = new Produto("0" + i, "Livro " + i, 10, 10.00 + i);
				productMap.put("0" + i, prod);
			}
			System.out.println("Estoque atualizado!\n");
		} else {
			System.out.println("\nAinda há produtos no estoque!");
		}
		main(null);
	}

	// --------------------------------------------------------------------------------
	
	public static void atualizarEstoque() {
		
		// For para percorrer o map de itens que possui no carrinnho
		for(ItemCarrinho item : carrinho.getMapItemCarrinho().values()) {
			
			// Pega quantidade de produtos desse item
			int qtdCarrinho = item.getQtdProduto();
			
			// Pega o mesmo produto no estoque
			Produto produto =  productMap.get(item.getProduto().getCodProduto());
			
			// Atualiza a quantidade
			int qtdEstoque = produto.getQtdProduto();
			int qtdFinal = qtdEstoque - qtdCarrinho;
			produto.setQtdProduto(qtdFinal);
			
			// Sobrescreve no map do estoque, usando o código do produto e produto com quantidade atualizada
			productMap.put(produto.getCodProduto(), produto);
		}
		
		main(null);
	}
	
	// --------------------------------------------------------------------------------
	
	public static void cliente() {

		if(cliente.getNomeCliente() == null) {
			String nomeCliente;
			char genero;
			System.out.println("Bem Vinde a Livraria BOOKPLUS \nDigite seu nome por gentileza: ");
			nomeCliente = scan.next();
			System.out.println("\nPor gentileza, informe seu gênero F/M/X: ");
			genero = scan.next().toUpperCase().charAt(0);

			cliente.setNomeCliente(nomeCliente);
			cliente.setGeneroCliente(genero);
			cliente.tratamentoGenero(genero);
			
		} else System.out.println(cliente.clienteComGenero());
	}
	
	// --------------------------------------------------------------------------------
}
