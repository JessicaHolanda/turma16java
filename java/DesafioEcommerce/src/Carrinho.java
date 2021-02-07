
import java.util.HashMap;
import java.util.Map;

public class Carrinho {
	
	private double subTotal;
	private Map<String, ItemCarrinho> mapItemCarrinho = new HashMap<String,ItemCarrinho>();
	
	public Carrinho() {
		
	}

	
	public Map<String, ItemCarrinho> getMapItemCarrinho() {
		return mapItemCarrinho;
	}

	public void setMapItemCarrinho(Map<String, ItemCarrinho> mapItemCarrinho) {
		this.mapItemCarrinho = mapItemCarrinho;
	}

	public double calculaSubtotal() {
		double aux=0;
		for(ItemCarrinho item : mapItemCarrinho.values()) {
			aux += item.getTotal();
		}
		this.subTotal = aux;
		return this.subTotal;
	}
	
	
	public void addItemCarrinho(ItemCarrinho itemCarrinho) {
		this.mapItemCarrinho.put(itemCarrinho.getProduto().getCodProduto(), itemCarrinho);
	}
	
	
	public void mostraCarrinho() {
		this.calculaSubtotal();
		for(ItemCarrinho mostrar : mapItemCarrinho.values()) {
			System.out.println(mostrar.toString());
		}
		System.out.printf("\n\nSubtotal: %.2f", this.subTotal);
	}
}
 