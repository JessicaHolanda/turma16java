
public class Ecommerce {

	public static void main(String[] args) {
		
		// CODIGO
		String codProduto[] = new String[10];
				
		for (int i=0; i<codProduto.length; i++){
				codProduto[i] = ("l0"+(i+1));
			}
				
		// DESCRICAO
		String descricaoProduto[] = {"LivroA", "LivroB", "LivroC", "LivroD", "LivroE", "LivroF",
		"LivroG", "LivroH", "LivroI", "LivroJ"};	
		
		// ESTOQUE TOTAL
		int estoqueTotal[] = new int [10]; 
		
		for(int i=0; i < estoqueTotal.length; i++) {
			estoqueTotal[i] = 10;
		}
		
		// VALOR PRODUTO
		double valorProduto[] = new double[10];
		double aux=10.00;
		
		for(int i=0; i <valorProduto.length; i++) {
			valorProduto[i] = aux;
			aux++;
		}
				
		mostraProdutos(codProduto, descricaoProduto, estoqueTotal, valorProduto);
		
	}
	
	// --------------------------------------------------------------------------
	
	public static void mostraProdutos(String codProduto[], String descricaoProduto[], int estoqueTotal[], double valorProduto[]) {
		
		System.out.println("CODIGO \t PRODUTO \t PREÇO \t\t QUANTIDADE");
		for(int i=0; i<10; i++) {
			System.out.printf("\n %s \t %s \t R$ %.2f \t Qtd:  %d", codProduto[i], descricaoProduto[i], valorProduto[i], estoqueTotal[i]);
		}
		
	}
	
	// --------------------------------------------------------------------------
	
	public static void estoque(int estoqueTotal[]) {
		
		for (int i=0; i<estoqueTotal.length;  i++) {
			if(estoqueTotal[i] != 0) {
				
			}
		}
		
		
	}
	

}
