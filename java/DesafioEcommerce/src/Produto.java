
public class Produto {

	private String codProduto;
	private String descricaoProduto;
	private int qtdProduto;
	private double valorProduto;
	
	
	public Produto(String codProduto, String descricaoProduto, int qtdProduto, double valorProduto) {
		this.codProduto = codProduto;
		this.descricaoProduto = descricaoProduto;
		this.qtdProduto = qtdProduto;
		this.valorProduto = valorProduto;
	}

	public Produto() {

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
	
	 public String toString(){
		 return  this.codProduto +
				 "\t "+
				 this.descricaoProduto +
				 "\t"+
				 this.qtdProduto+
				 "\t\t R$ "+
				 String.format("%.2f", this.valorProduto);
	    }
		
	public void verificarEstoque() {
		
	}
	
	public void atualizarEstoque() {
		
		
	}
	
	
	
}
