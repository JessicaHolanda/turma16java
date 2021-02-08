
public class ItemCarrinho {

	
	private Produto produto;
	private int qtdProduto;
	private double totalItem;
	
	
	public ItemCarrinho(Produto produto, int qtdProduto) {
		this.produto = produto;
		this.qtdProduto = qtdProduto;
		
		this.totalItem();
	}
	
	public ItemCarrinho(Produto produto) {
		this.produto = produto;
		
		this.totalItem();
	}


	public int getQtdProduto() {
		return qtdProduto;
	}


	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
		this.totalItem();
	}

	public double getTotal() {
		return totalItem;
	}

	public void setTotal(double totalItem) {
		this.totalItem = totalItem;
	}
	
	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public void totalItem() {
		double aux = this.produto.getValorProduto();
		this.totalItem = aux * this.qtdProduto;
		
	}
	
	public String toString(){
		 return "Código: "+
				 this.produto.getCodProduto() +
				 "\tQuantidade: "+
				 this.qtdProduto+
				 "\tPreço unitário: R$"+
				 String.format("%.2f", this.produto.getValorProduto())+
				"\tTotal item: R$ "+
				String.format("%.2f", this.totalItem);
	    }
	
}
