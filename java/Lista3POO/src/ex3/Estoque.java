package ex3;

public class Estoque {

	private String codProduto;
	private String descricaoProduto;
	private int qtdProduto;
	private double valorProduto;
	//private List<Estoque> estoque = new ArrayList<Estoque>();
	
	
	
	public Estoque(String codProduto, String descricaoProduto, int qtdProduto, double valorProduto) {
		this.codProduto = codProduto;
		this.descricaoProduto = descricaoProduto;
		this.qtdProduto = qtdProduto;
		this.valorProduto = valorProduto;
	}
	
	public Estoque() {
		
	}


	public String getCodProduto() {
		return codProduto;
	}


	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}


	public String getDescricaoProduto() {
		return descricaoProduto;
	}


	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}


	public int getQtdProduto() {
		return qtdProduto;
	}


	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}


	public double getValorProduto() {
		return valorProduto;
	}


	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}


	/*public List<Estoque> getEstoque() {
		return estoque;
	}


	public void setEstoque(Estoque itemEstoque) {
		this.estoque.add(itemEstoque);
	}*/
	
	
	
}
