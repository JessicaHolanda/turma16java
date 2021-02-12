
import java.util.HashMap;
import java.util.Map;

public class Carrinho {
	
	private double subTotal;
	private Map<String, ItemCarrinho> mapItemCarrinho = new HashMap<String,ItemCarrinho>();
	
	public Carrinho() {
		
	}
	
	public double getSubTotal() {
		this.calculaSubtotal();
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public Map<String, ItemCarrinho> getMapItemCarrinho() {
		return mapItemCarrinho;
	}

	public void setMapItemCarrinho(Map<String, ItemCarrinho> mapItemCarrinho) {
		this.mapItemCarrinho = mapItemCarrinho;
	}
	
	// --------------------------------------------------------------------------------

	public double calculaSubtotal() {
		double aux=0;
		for(ItemCarrinho item : this.mapItemCarrinho.values()) {
			aux += item.getTotal();
		}
		this.subTotal = aux;
		return this.subTotal;
	}
	
	// --------------------------------------------------------------------------------
	
	public void addItemCarrinho(ItemCarrinho itemCarrinho) {
		if(mapItemCarrinho.containsKey(itemCarrinho.getProduto().getCodProduto())) {	
			
			ItemCarrinho aux = this.mapItemCarrinho.get(itemCarrinho.getProduto().getCodProduto());
			int qtd = aux.getQtdProduto() + itemCarrinho.getQtdProduto();
			itemCarrinho.setQtdProduto(qtd);
			
			System.out.println("qtd nova: "+ itemCarrinho.getQtdProduto());
		}
		
		this.mapItemCarrinho.put(itemCarrinho.getProduto().getCodProduto(), itemCarrinho);
	}
	
	// --------------------------------------------------------------------------------
	
	public void alteraCarrinho(ItemCarrinho itemCarrinho) {
		
		this.mapItemCarrinho.put(itemCarrinho.getProduto().getCodProduto(), itemCarrinho);
		this.mostraCarrinho();
		
	}
	
	
	
	// --------------------------------------------------------------------------------
	
	public void removerItemCarrinho(String cod) {
		if(mapItemCarrinho.containsKey(cod)) {	
			mapItemCarrinho.remove(cod);
		}
	}
	
	// --------------------------------------------------------------------------------
	public void mostraCarrinho() {
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\t\t VISUALIZAR CARRINHO");
		System.out.println("------------------------------------------------------------------------");
		this.calculaSubtotal();
		for(ItemCarrinho mostrar : this.mapItemCarrinho.values()) {
			System.out.println(mostrar.toString());
		}
		System.out.printf("\n\nSubtotal: %.2f", this.subTotal);
	}
}
 